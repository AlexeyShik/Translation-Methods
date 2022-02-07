import exception.IllegalTokenException;
import exception.UnexpectedTokenException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.InputStream;

public class ParserTest {

    private static final String PATH_PREFIX = "src/main/resources/sources/";

    private void test(String fileName) {
        try (InputStream is = new FileInputStream(PATH_PREFIX + fileName)) {
            Parser.Tree tree = new Parser().parse(is);
            new Visualizer(tree, fileName.substring(0, fileName.indexOf('.'))).visualise();
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
        try (InputStream is = new FileInputStream(PATH_PREFIX + "illegal_token.txt")) {
            new Parser().parse(is);
            Assertions.fail();
        } catch (IllegalTokenException e) {
            //  OK
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void test07IllegalRule() {
        try (InputStream is = new FileInputStream(PATH_PREFIX + "illegal_rule.txt")) {
            new Parser().parse(is);
        } catch (UnexpectedTokenException e) {
            //  OK
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void test08Examples() {
        test("example1.txt");
        test("example2.txt");
        test("example3.txt");
    }
}
