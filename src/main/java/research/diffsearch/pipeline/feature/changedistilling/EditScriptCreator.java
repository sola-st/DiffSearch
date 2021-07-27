package research.diffsearch.pipeline.feature.changedistilling;

import org.antlr.v4.runtime.tree.Tree;
import research.diffsearch.tree.ParseTreeNode;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.List;

import static research.diffsearch.pipeline.feature.changedistilling.EditScriptOperation.Type.*;

/**
 * @author Paul Bredl
 */
public class EditScriptCreator {

    private final MatchList matchList;
    private final ParseTreeNode oldTree;
    private final ParseTreeNode newTree;

    public EditScriptCreator(MatchList matchList, ParseTreeNode oldTree, ParseTreeNode newTree) {
        this.matchList = matchList;
        this.oldTree = oldTree;
        this.newTree = newTree;
    }

    public EditScriptCreator(Tree tree, ProgrammingLanguage language) {
        var pair = ParseTreeNode.fromTree(tree, language.getRuleNames());

        this.matchList = new ParseTreeMatcher(pair.getLeft(), pair.getRight()).calculateMatches();
        this.oldTree = pair.getLeft();
        this.newTree = pair.getRight();
    }

    public List<EditScriptOperation> calculateEditScript() {
        var result = new ArrayList<EditScriptOperation>();

        // update phase
        for (var match : matchList.getMatches()) {
            var oldNode = match.getOldNode();
            var newNode = match.getNewNode();
            if (oldNode.getNodeLabel().equals(newNode.getNodeLabel())) {
                result.add(new EditScriptOperation(EQUAL, oldNode, newNode));
            } else {
                result.add(new EditScriptOperation(UPDATE, oldNode, newNode));
            }
        }

        // align phase
        for (var match : matchList.getMatches()) {
            if (isMisaligned(match)) {
                result.add(new EditScriptOperation(ALIGN, match.getOldNode(), match.getNewNode()));
            }
        }

        // insert phase
        newTree.forEachPreOrder(newTreeNode -> {
            if (!matchList.hasMatchFor(newTreeNode)) {
                // check if parent is matched
                if (!newTreeNode.isRoot() && newTreeNode.getParent().isMatched()) {
                    result.add(new EditScriptOperation(INSERT, null, newTreeNode));
                    newTreeNode.setMatched(true);
                }
            }
        });

        // move phase
        for (var match : matchList.getMatches()) {
            var oldNode = match.getOldNode();
            var newNode = match.getNewNode();
            if (!oldNode.isRoot() && !newNode.isRoot()) {
                if (!matchList.hasMatch(oldNode.getParent(), newNode.getParent())) {
                    result.add(new EditScriptOperation(MOVE, match.getOldNode(), match.getNewNode()));
                }
            }
        }

        // delete phase
        oldTree.forEachPostOrder(oldTreeNode -> {
            if (!matchList.hasMatchFor(oldTreeNode)) {
                // check if parent is matched
                result.add(new EditScriptOperation(DELETE, oldTreeNode, null));
            }
        });

        return result;
    }

    private boolean isMisaligned(Match match) {
        if (match.getOldNode().isRoot() || match.getNewNode().isRoot()) {
            return false;
        }
        var oldNode = match.getOldNode();
        var newNode = match.getNewNode();

        if (matchList.hasMatch(oldNode.getParent(), newNode.getParent())) {
            return oldNode.getPosition() != newNode.getPosition();
        } else {
            // no misalignment when parents do not match
            return false;
        }
    }

}
