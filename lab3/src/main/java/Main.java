import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static String translate(InputStream inputStream) throws IOException {
        ANTLRInputStream is = new ANTLRInputStream(inputStream);
        ExprLexer lexer = new ExprLexer(is);
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        return parser.prog().value;
    }

    public static void main(String[] args) throws IOException {
        ANTLRInputStream is = new ANTLRInputStream(System.in);
        ExprLexer lexer = new ExprLexer(is);
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        System.out.println(parser.prog().value);
    }
}
