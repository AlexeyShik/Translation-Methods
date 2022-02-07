import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GrammarTest {

    private static final String PATH_PREFIX = "src/main/resources/";
    private static final String PY_SUFFIX = ".py";
    private static final String C_SUFFIX = ".c";
    private static final String OUT_SUFFIX = ".out";

    private static void test(String fileName) {
        fileName = PATH_PREFIX + fileName;
        String cCode = "";
        try (InputStream is = new FileInputStream(fileName + PY_SUFFIX)) {
            cCode = Main.translate(is);
        } catch (Exception e) {
            Assertions.fail("Exception: " + e.getMessage());
        }

        Path path = Path.of(fileName + C_SUFFIX);
        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            //  OK
        } catch (IOException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }

        try {
            Files.writeString(path, cCode);
        } catch (IOException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }

        try {
            Process process = Runtime.getRuntime().exec("gcc -o "
                    + fileName + OUT_SUFFIX + " " + fileName + C_SUFFIX);
            process.waitFor();
            Assertions.assertEquals(0, process.exitValue());
//          process = Runtime.getRuntime().exec("./" + outFile);
//          process.waitFor();
            Runtime.getRuntime().exec("rm "  + fileName + OUT_SUFFIX);
        } catch (IOException | InterruptedException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }
    }

    @Test
    public void test_00_void() {
        test("void");
    }

    @Test
    public void test_01_read() {
        test("read");
    }

    @Test
    public void test_02_write() {
        test("write");
    }

    @Test
    public void test_03_arithmetic() {
        test("arithmetic");
    }

    @Test
    public void test_04_example() {
        test("example");
    }

    @Test
    public void test_05_if_else() {
        test("if_else");
    }

    @Test
    public void test_06_loops() {
        test("loops");
    }

    @Test
    public void test_07_functions() {
        test("functions");
    }

    @Test
    public void test_08_nested() {
       test("nested");
    }
}
