/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2014 by Bart Kiers
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * Project : python3-parser; an ANTLR4 grammar for Python 3 https://github.com/bkiers/python3-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 */

// Scraping from https://docs.python.org/3/reference/grammar.html

parser grammar Python3Parser;

options {
	superClass = Python3ParserBase;
	tokenVocab = Python3Lexer;
}

program: query_snippet QUERY_ARROW query_snippet EOF;

query_snippet:
	NEWLINE? (expr | (stmt NEWLINE+)* stmt | WILDCARD) NEWLINE?
	| EMPTY;

decorator: '@' dotted_name ( '(' arglist? ')')? NEWLINE;
decorators: decorator+;
decorated: decorators (classdef | funcdef | async_funcdef);

async_funcdef: ASYNC funcdef;
funcdef: 'def' name parameters ('->' expr)? ':' block;

parameters: '(' typedargslist? ')';
typedargslist: (
		tfpdef (assign expr)? (',' tfpdef (assign expr)?)* (
			',' (
				'*' tfpdef? (',' tfpdef (assign expr)?)* (
					',' ('**' tfpdef ','?)?
				)?
				| '**' tfpdef ','?
			)?
		)?
		| '*' tfpdef? (',' tfpdef (assign expr)?)* (
			',' ('**' tfpdef ','?)?
		)?
		| '**' tfpdef ','?
	);
tfpdef: name (':' expr)?;
varargslist: (
		vfpdef (assign expr)? (',' vfpdef (assign expr)?)* (
			',' (
				'*' vfpdef? (',' vfpdef (assign expr)?)* (
					',' ('**' vfpdef ','?)?
				)?
				| '**' vfpdef (',')?
			)?
		)?
		| '*' vfpdef? (',' vfpdef (assign expr)?)* (
			',' ('**' vfpdef ','?)?
		)?
		| '**' vfpdef ','?
	);
vfpdef: name;

stmt: simple_stmts | compound_stmt;
simple_stmts:
	simple_stmt
	| ((simple_stmt ';') | WILDCARD)+ simple_stmt?;
// simple_stmts: simple_stmt (';' simple_stmt)* ';'?;
simple_stmt:
	WILDCARD
	| expr_stmt
	| del_stmt
	| pass_stmt
	| flow_stmt
	| import_stmt
	| global_stmt
	| nonlocal_stmt
	| assert_stmt;

expr_stmt:
	test_or_star_expr_list (
		annotated_assign
		| augmenting_assign (yield_expr | exprlist)
		| (assign (yield_expr | test_or_star_expr_list))*
	);
annotated_assign: ':' expr (assign expr)?;
test_or_star_expr_list: (expr) (',' (expr))* ','?;
augmenting_assign:
	'+='
	| '-='
	| '*='
	| '@='
	| '/='
	| '%='
	| '&='
	| '|='
	| '^='
	| '<<='
	| '>>='
	| '**='
	| '//='
	| OP;
assign: '=' | OP;
// For normal and annotated assignments, additional restrictions enforced by the interpreter
del_stmt: 'del' exprlist;
pass_stmt: 'pass';
flow_stmt:
	break_stmt
	| continue_stmt
	| return_stmt
	| raise_stmt
	| yield_stmt;
break_stmt: 'break';
continue_stmt: 'continue';
return_stmt: 'return' exprlist?;
yield_stmt: yield_expr;
raise_stmt: 'raise' (expr ('from' expr)?)?;
import_stmt: import_name | import_from;
import_name: 'import' dotted_as_names;
// note below: the ('.' | '...') is necessary because '...' is tokenized as ELLIPSIS
import_from: (
		'from' (('.' | '...')* dotted_name | ('.' | '...')+) 'import' (
			'*'
			| '(' import_as_names ')'
			| import_as_names
		)
	);
import_as_name: name ('as' name)?;
dotted_as_name: dotted_name ('as' name)?;
import_as_names: import_as_name (',' import_as_name)* ','?;
dotted_as_names: dotted_as_name (',' dotted_as_name)*;
dotted_name: name ('.' name)*;
global_stmt: 'global' name (',' name)*;
nonlocal_stmt: 'nonlocal' name (',' name)*;
assert_stmt: 'assert' expr (',' expr)?;

compound_stmt:
	if_stmt
	| while_stmt
	| for_stmt
	| try_stmt
	| with_stmt
	| funcdef
	| classdef
	| decorated
	| async_stmt
	| match_stmt;
async_stmt: ASYNC (funcdef | with_stmt | for_stmt);
if_stmt:
	'if' expr ':' (
		block ('elif' expr ':' block)* ('else' ':' block)?
	)?;
while_stmt: 'while' expr ':' block ('else' ':' block)?;
for_stmt:
	'for' exprlist 'in' exprlist ':' block ('else' ':' block)?;
try_stmt: (
		'try' ':' (
			block (except_clause ':' block?)+ ('else' ':' block?)? (
				'finally' ':' block?
			)?
			| 'finally' ':' block?
		)?
	);
with_stmt: 'with' with_item (',' with_item)* ':' block;
with_item: expr ('as' expr)?;
// NB compile.c makes sure that the default except clause is last
except_clause: 'except' (expr ('as' name)?)?;
block:
	WILDCARD
	| simple_stmts
	| NEWLINE INDENT (stmt NEWLINE+)* stmt DEDENT;
match_stmt:
	'match' subject_expr ':' NEWLINE INDENT case_block+ DEDENT;
subject_expr:
	star_named_expression ',' star_named_expressions?
	| expr;
star_named_expressions: ',' star_named_expression+ ','?;
star_named_expression: '*' expr | expr;
case_block: 'case' patterns guard? ':' block;
guard: 'if' expr;
patterns: open_sequence_pattern | pattern;
pattern: as_pattern | or_pattern;
as_pattern: or_pattern 'as' pattern_capture_target;
or_pattern: closed_pattern ('|' closed_pattern)*;
closed_pattern:
	literal_pattern
	| capture_pattern
	| wildcard_pattern
	| value_pattern
	| group_pattern
	| sequence_pattern
	| mapping_pattern
	| class_pattern;
literal_pattern:
	signed_number { this.CannotBePlusMinus() }?
	| complex_number
	| strings
	| 'None'
	| 'True'
	| 'False';
literal_expr:
	signed_number { this.CannotBePlusMinus() }?
	| complex_number
	| strings
	| 'None'
	| 'True'
	| 'False';
complex_number:
	signed_real_number '+' imaginary_number
	| signed_real_number '-' imaginary_number;
signed_number: NUMBER | '-' NUMBER;
signed_real_number: real_number | '-' real_number;
real_number: NUMBER;
imaginary_number: NUMBER;
capture_pattern: pattern_capture_target;
pattern_capture_target:
	/* cannot be '_' */ name { this.CannotBeDotLpEq() }?;
wildcard_pattern: '_';
value_pattern: attr { this.CannotBeDotLpEq() }?;
attr: name ('.' name)+;
name_or_attr: attr | name;
group_pattern: '(' pattern ')';
sequence_pattern:
	'[' maybe_sequence_pattern? ']'
	| '(' open_sequence_pattern? ')';
open_sequence_pattern:
	maybe_star_pattern ',' maybe_sequence_pattern?;
maybe_sequence_pattern:
	maybe_star_pattern (',' maybe_star_pattern)* ','?;
maybe_star_pattern: star_pattern | pattern;
star_pattern: '*' pattern_capture_target | '*' wildcard_pattern;
mapping_pattern:
	'{' '}'
	| '{' double_star_pattern ','? '}'
	| '{' items_pattern ',' double_star_pattern ','? '}'
	| '{' items_pattern ','? '}';
items_pattern: key_value_pattern (',' key_value_pattern)*;
key_value_pattern: (literal_expr | attr) ':' pattern;
double_star_pattern: '**' pattern_capture_target;
class_pattern:
	name_or_attr '(' ')'
	| name_or_attr '(' positional_patterns ','? ')'
	| name_or_attr '(' keyword_patterns ','? ')'
	| name_or_attr '(' positional_patterns ',' keyword_patterns ','? ')';
positional_patterns: pattern (',' pattern)*;
keyword_patterns: keyword_pattern (',' keyword_pattern)*;
keyword_pattern: name assign pattern;

expr:
	'lambda' varargslist? ':' expr
	| expr bin_op expr
	| unary_prefix_operators expr
	| expr 'if' expr 'else' expr
	| AWAIT? atom trailer*
	| EXPR
	| WILDCARD;

// <> isn't actually a valid comparison operator in Python. It's here for the sake of a __future__
// import described in PEP 401 (which really works :-)
bin_op:
	'<'
	| '>'
	| '=='
	| '>='
	| '<='
	| '<>'
	| '!='
	| 'in'
	| ('not' 'in')
	| 'is'
	| ('is' 'not')
	| 'or'
	| 'and'
	| '|'
	| '&'
	| '^'
	| '<<'
	| '>>'
	| '**'
	| '+'
	| '-'
	| '*'
	| '@'
	| '/'
	| '%'
	| '//'
	| BINOP;

unary_prefix_operators: '+' | '-' | '~' | '*' | 'not';
atom:
	'(' (yield_expr | exprlist_comp)? ')'
	| '[' exprlist_comp? ']'
	| '{' dictorsetmaker? '}'
	| name
	| NUMBER
	| STRING+
	| '...'
	| 'None'
	| 'True'
	| 'False'
	| LT;
name: NAME | '_' | 'match' | ID;
exprlist_comp: (expr) ( comp_for | (',' (expr))* ','?);
trailer: '(' arglist? ')' | '[' subscriptlist ']' | '.' name;
subscriptlist: subscript_ (',' subscript_)* ','?;
subscript_: expr | expr? ':' expr? (':' expr?)?;
exprlist: (expr) (',' (expr))* ','?;
dictorsetmaker: (
		(
			(expr ':' expr | '**' expr) (
				comp_for
				| (',' (expr ':' expr | '**' expr))* ','?
			)
		)
		| ((expr) (comp_for | (',' (expr))* ','?))
	);

classdef: 'class' name ('(' arglist? ')')? ':' block | WILDCARD;

arglist: argument (',' argument)* ','?;

// The reason that keywords are test nodes instead of NAME is that using NAME results in an
// ambiguity. ast.c makes sure it's a NAME. "test assign test" is really "keyword assign test", but
// we have no such token. These need to be in a single rule to avoid grammar that is ambiguous to
// our LL(1) parser. Even though 'test' includes '*expr' in star_expr, we explicitly match '*' here,
// too, to give it proper precedence. Illegal combinations and orderings are blocked in ast.c:
// multiple (test comp_for) arguments are blocked; keyword unpackings that precede iterable
// unpackings are blocked; etc.
argument: (
		expr comp_for?
		| expr assign expr
		| '**' expr
		| '*' expr
		| WILDCARD
	);

comp_iter: comp_for | comp_if;
comp_for: ASYNC? 'for' exprlist 'in' expr comp_iter?;
comp_if: 'if' expr comp_iter?;

// not used in grammar, but may appear in "node" passed from Parser to Compiler
encoding_decl: name;

yield_expr: 'yield' yield_arg?;
yield_arg: 'from' expr | exprlist;

strings: STRING+;