import model.Grammar;
import parser.Parser;
import parser.Tree;
import parser.Visualizer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void translate(String filename) {
        try {
            Grammar grammar = InputGrammarTranslator.translateGrammar(filename);
            Parser parser = new Parser(grammar);
            try (InputStream is = new FileInputStream("src/main/resources/input.txt")) {
                Tree<?> tree = parser.parse(is);
                new Visualizer(tree, "olvin").visualise();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        translate("src/main/resources/grammar.txt");
    }
}
