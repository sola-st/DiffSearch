package research.diffsearch;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Grammar_Tree {
	    public String change_string;
		private  GrammarLexer lexer;
		private  CommonTokenStream tokens;
		private  GrammarParser parser;
		private  ParseTree parsetree;
		public int leaves_number;
		
		Grammar_Tree(String change){
			change_string = change;
			lexer = new GrammarLexer(CharStreams.fromString(change));
			tokens = new CommonTokenStream(lexer);
		    parser = new GrammarParser(tokens);
		    parsetree = parser.diffsearch();
		}
		
		String get_change_string() {
			return change_string;
	}
		
		String get_tree_string() {
				return parsetree.toStringTree(parser);
		}
	
		GrammarLexer get_lexer() {
			return lexer;
		}
		
		CommonTokenStream get_tokens() {
			return tokens;
		}
		
		GrammarParser get_parser() {
			return parser;
		}
		
		ParseTree get_parsetree() {
			return parsetree;
		}
		
		
		
}
