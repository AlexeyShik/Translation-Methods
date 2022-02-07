import model.Grammar;
import org.junit.jupiter.api.Test;
import parser.Parser;
import parser.Tree;
import parser.Visualizer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CalculatorTest {

    private static final String PREFIX = "src/main/resources/calculator/inputs/";
    private static final Grammar GRAMMAR;

    static {
        GRAMMAR = InputGrammarTranslator.translateGrammar("src/main/resources/calculator/grammar.txt");
    }

    private void test(String filename) {
        try {
            Parser parser = new Parser(GRAMMAR);
            try (InputStream is = new FileInputStream(PREFIX + filename)) {
                Tree<?> tree = parser.parse(is);
                new Visualizer(tree, "calculator/",  filename).visualise();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

//    @Test
//    public void test01Void() {
//        test("void.txt");
//    }

    @Test
    public void test02SimpleFile() {
        test("simple.txt");
    }
//
//    @Test
//    public void test03Priority() {
//        test("priority.txt");
//    }
//
//
//    @Test
//    public void test04Parenthesis() {
//        test("parenthesis.txt");
//    }
//
//    @Test
//    public void test05HardFile() {
//        test("hard.txt");
//    }

}
