import exception.ParsingException;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Visualizer {

    private static final String PATH_PREFIX = "src/main/resources/";

    private final Parser.Tree tree;
    private final String testName;

    public Visualizer(Parser.Tree tree, String testName) {
        this.tree = tree;
        this.testName = testName;
    }

    private void printTree(Parser.Tree tree) {
        Path path = Path.of(PATH_PREFIX, "graph.dot");
        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            //  OK
        } catch (IOException e) {
            throw new ParsingException(e.getMessage());
        }
        StringBuilder builder = new StringBuilder("graph {\n");
        printTree(tree.children.get(0), tree, builder); // tree.value is E0, so only one child -- E
        builder.append("}");
        try {
            Files.writeString(path, builder.toString());
        } catch (IOException e) {
            throw new ParsingException(e.getMessage());
        }
        try {
            String inputName = path.toString();
            String outputName = PATH_PREFIX + "images/" + testName + ".svg";
            if (!Files.exists(Path.of(outputName))) {
                Process process = Runtime.getRuntime().exec("touch " + outputName);
                process.waitFor();
                process = Runtime.getRuntime().exec("chmod 777 " + outputName);
                process.waitFor();
            }
            Process process = Runtime.getRuntime().exec("dot -Tsvg " + inputName + " -o " + outputName);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            throw new ParsingException(e.getMessage());
        }
    }

    private String escape(Parser.Tree tree) {
        return "\"" + tree.value + "_" + tree.hashCode() + "\"";
    }

    private void printTree(Parser.Tree tree, Parser.Tree parent, StringBuilder builder) {
        builder.append("\t")
                .append(escape(parent))
                .append(" -- ")
                .append(escape(tree))
                .append("\n\t")
                .append(escape(parent))
                .append("[label=\"").append(parent.value).append("\"]").append("\n\t")
                .append(escape(tree))
                .append("[label=\"").append(tree.value).append("\"]").append("\n");
        for (Parser.Tree child : tree.children) {
            printTree(child, tree, builder);
        }
    }

    public void visualise() {
        printTree(tree);
    }
}
