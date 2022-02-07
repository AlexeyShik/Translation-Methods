package parser;

import model.NonTerm;
import model.Term;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Visualizer {

    private static final boolean DEBUG = false;

    private static final String PATH_PREFIX = "src/main/resources/";

    private final Tree<?> tree;
    private final String testName;
    private String pack = "";

    public Visualizer(Tree<?> tree, String testName) {
        this.tree = tree;
        this.testName = testName;
    }

    public Visualizer(Tree<?> tree, String pack, String testName) {
        this.tree = tree;
        this.testName = testName;
        this.pack = pack;
    }

    private void printTree(Tree<?> tree) {
        Path path = Path.of(PATH_PREFIX, "graph.dot");
        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            //  OK
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.createDirectories(Path.of(PATH_PREFIX + pack + "images/"));
        } catch (FileAlreadyExistsException e) {
            //  OK
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder("graph {\n");
        for (int i = 0; i < tree.children.size(); ++i) {
            printTree(tree.children.get(i), tree, builder);
        }
        builder.append("}");
        try {
            Files.writeString(path, builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String inputName = path.toString();
            String outputName = PATH_PREFIX + pack + "images/" + testName.replace(".txt", "") + ".svg";
            if (!Files.exists(Path.of(outputName))) {
                Process process = Runtime.getRuntime().exec("touch " + outputName);
                process.waitFor();
                process = Runtime.getRuntime().exec("chmod 777 " + outputName);
                process.waitFor();
            }
            Process process = Runtime.getRuntime().exec("dot -Tsvg " + inputName + " -o " + outputName);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String escape(Tree<?> tree) {
        return "\"" + tree.name + "_" + tree.hashCode() + "\"";
    }

    private String valueOf(Tree<?> tree) {
        Object value = tree.value;
        String str = tree.value.toString();
        if (tree.name.equals("E0") || DEBUG) {
            if (value.getClass().getName().contains("Utils$")
                    && Arrays.stream(value.getClass().getDeclaredFields()).anyMatch(x -> x.getName().equals("value"))) {
                try {
                    if (tree.children.size() == 1 && tree.children.get(0).value.getClass().equals(String.class)) {
                        str += "\n" + tree.children.get(0).value;
                    } else {
                        str += "\n" + Arrays.stream(value.getClass().getDeclaredFields()).filter(x -> x.getName().equals("value")).findFirst().get().get(value).toString();
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return str;
    }

    private void printTree(Tree<?> tree, Tree<?> parent, StringBuilder builder) {
        builder.append("\t")
                .append(escape(parent))
                .append(" -- ")
                .append(escape(tree))
                .append("\n\t")
                .append(escape(parent))
                .append("[label=\"").append(valueOf(parent)).append("\"]").append("\n\t")
                .append(escape(tree))
                .append("[label=\"").append(valueOf(tree)).append("\"]").append("\n");
        for (Tree<?> child : tree.children) {
            printTree(child, tree, builder);
        }
    }

    public void visualise() {
        printTree(tree);
    }
}
