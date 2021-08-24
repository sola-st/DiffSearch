package research.diffsearch.main;

import com.google.common.collect.Iterables;
import research.diffsearch.tree.SerializableTreeNode;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomQueryCreation {

    public static void main(String[] args) {
        String pathout = "./new_queries.txt";
        int n = 5;
        var language = ProgrammingLanguage.JAVA;

        var codeChangesC = FilePathUtils.getCodeChanges(language);
        int numChanges = codeChangesC.size();

        var samples = new Random()
                .ints(n, 0, numChanges)
                .sorted()
                .boxed()
                .map(i -> Iterables.get(codeChangesC, i))
                .peek(x -> System.out.println(x.getFullChangeString().replaceAll("\n", " ")))
                .collect(Collectors.toList());

        var trees = samples.stream()
                .map(cc -> TreeFactory.getTreeFromCodeChange(cc, language))
                .collect(Collectors.toList());

        for (var t : trees) {
            if (t.getChildCount() != 4) {
                System.out.println(t.toStringTree());
            }

            var rootOld = t.getChild(0);
            var rootNew = t.getChild(2);
            processNode(rootOld, rootOld);
            processNode(rootNew, rootNew);

        }

        System.out.println("Queries:");

        trees.stream().map(node -> node.getCompleteNodeText(language.getRuleNames()))
                .map(text -> text.replace(" <EOF>", ""))
                .forEach(System.out::println);
    }

    private static void processNode(SerializableTreeNode node, SerializableTreeNode root) {
//        var probabilities = new Object() {
//            final double expr = 0.3;
//            final double id = 0.3;
//            final double lt = 0.7;
//            final double binOp = 0.3;
//            final double unOp = 0.3;
//            final double op = 0.1;
//            final double wildcard = 0.05;
//            final double escalate = 0.1;
//        };
        var probabilities = new Object() {
            final double expr = 0.2;
            final double id = 0.9;
            final double lt = 0.9;
            final double binOp = 0.9;
            final double unOp = 0.9;
            final double op = 0.5;
            final double wildcard = 0.03;
            final double escalate = 0.0;
        };
        var label = node.getNodeLabel();

        if (label.equals("identifier")) {
            if (new Random().nextDouble() < probabilities.id) {
                node.setChildren(List.of(new SerializableTreeNode("ID", node.getProgrammingLanguage())));
            }
        }
        if (List.of("classOrInterfaceModifier", "querySnippet", "expressionList", "expression").contains(label)) {
            if (new Random().nextDouble() < probabilities.wildcard) {
                node.setChildren(List.of(new SerializableTreeNode("<...>", node.getProgrammingLanguage())));
            }
        }

        if (label.equals("expression") || label.equals("expressionList")) {
            if (new Random().nextDouble() < probabilities.expr) {
                node.setChildren(List.of(new SerializableTreeNode("EXPR", node.getProgrammingLanguage())));
            }
        }
        if (label.equals("literal")) {
            if (new Random().nextDouble() < probabilities.lt) {
                node.setChildren(List.of(new SerializableTreeNode("LT", node.getProgrammingLanguage())));
            }
        }
        if (label.equals("binary_operators")) {
            if (new Random().nextDouble() < probabilities.binOp) {
                node.setChildren(List.of(new SerializableTreeNode("binOP", node.getProgrammingLanguage())));
            }
        }
        if (label.equals("assign_operators")) {
            if (new Random().nextDouble() < probabilities.op) {
                node.setChildren(List.of(new SerializableTreeNode("OP", node.getProgrammingLanguage())));
            }
        }
        if (label.equals("unary_postfix_operators") || label.equals("unary_prefix_operators")) {
            if (new Random().nextDouble() < probabilities.unOp) {
                node.setChildren(List.of(new SerializableTreeNode("unOP", node.getProgrammingLanguage())));
            }
        }

        if (List.of("importDeclaration", "typeDeclaration", "packageDeclaration", "annotation",
                "multipleStatements", "methodCall").contains(label)) {
            if (new Random().nextDouble() < probabilities.escalate) {
                root.setChildren(List.of(node));
            }
        }

        node.getChildren().forEach(node1 -> processNode(node1, root));
    }
}
