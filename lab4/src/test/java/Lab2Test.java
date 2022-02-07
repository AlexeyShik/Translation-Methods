import lexer.LexerException;
import model.Grammar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import parser.Parser;
import parser.ParsingException;
import parser.Tree;
import parser.Visualizer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Lab2Test {

    private static final String PREFIX = "src/main/resources/lab2/inputs/";
    private static final Grammar GRAMMAR;

    static {
        GRAMMAR = InputGrammarTranslator.translateGrammar("src/main/resources/lab2/grammar.txt");
    }

    private void test(String filename) {
        try {
            Parser parser = new Parser(GRAMMAR);
            try (InputStream is = new FileInputStream(PREFIX + filename)) {
                Tree<?> tree = parser.parse(is);
                new Visualizer(tree, "lab2/",  filename).visualise();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    private void testError(String filename) {
        try (InputStream is = new FileInputStream(PREFIX + filename)) {
            Grammar grammar = InputGrammarTranslator.translateGrammar("src/main/resources/lab2/grammar.txt");
            new Parser(grammar).parse(is);
            Assertions.fail();
        } catch (ParsingException | LexerException e) {
            //  OK
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void test01Void() {
        test("void.txt");
    }

    @Test
    public void test02SimpleFile() {
        test("simple.txt");
    }

    @Test
    public void test03NoParenthesis() {
        test("no_parenthesis.txt");
    }

    @Test
    public void test04HardFile() {
        test("hard.txt");
    }

    @Test
    public void test05Arithmetic() {
        test("arithmetic.txt");
    }

    @Test
    public void test06IllegalToken() {
        testError("illegal_token.txt");
    }

    @Test
    public void test07IllegalRule() {
        testError("illegal_rule.txt");
    }

    @Test
    public void test08Examples() {
        test("example1.txt");
        test("example2.txt");
        test("example3.txt");
    }
}
