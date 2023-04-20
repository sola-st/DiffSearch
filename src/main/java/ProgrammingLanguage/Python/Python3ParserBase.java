package ProgrammingLanguage.Python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public abstract class Python3ParserBase extends Parser {
    protected Python3ParserBase(TokenStream input) {
        super(input);
    }

    public boolean CannotBePlusMinus() {
        return true;
    }

    public boolean CannotBeDotLpEq() {
        return true;
    }
    
    /**
     * Modified to not include {@code \n} nodes in parse tree;
     * Original Documentation:
     * 
     * {@inheritDoc}
     */
	@Override
	public Token consume() {
		Token o = getCurrentToken();
		if (o.getType() != EOF) {
			getInputStream().consume();
		}
		boolean hasListener = _parseListeners != null && !_parseListeners.isEmpty();
		if (_buildParseTrees || hasListener) {
			if ( _errHandler.inErrorRecoveryMode(this) ) {
				ErrorNode node = _ctx.addErrorNode(createErrorNode(_ctx,o));
				if (_parseListeners != null) {
					for (ParseTreeListener listener : _parseListeners) {
						listener.visitErrorNode(node);
					}
				}
			}
			else if (!o.getText().equals("\n")) {
				
				TerminalNode node = _ctx.addChild(createTerminalNode(_ctx,o));
				if (_parseListeners != null) {
					for (ParseTreeListener listener : _parseListeners) {
						listener.visitTerminal(node);
					}
				}
			}
		}
		return o;
	}
}