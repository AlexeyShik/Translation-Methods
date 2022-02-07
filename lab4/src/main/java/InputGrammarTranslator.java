import model.Grammar;
import model.ParserRule;
import net.openhft.compiler.CompilerUtils;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.joining;

public class InputGrammarTranslator {

    private InputGrammarTranslator() {}

    public static Grammar translateGrammar(String filename) {
        try (InputStream inputStream = new FileInputStream(filename)) {
            ANTLRInputStream is = new ANTLRInputStream(inputStream);
            GrammarLexer lexer = new GrammarLexer(is);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
            GrammarParser.ProgContext prog = parser.prog();
            String utilityCode = buildUtilityCode(prog);
            Object utility = generateUtils(utilityCode);
            return new Grammar(prog.parserRules, prog.lexerRules, utility);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String buildUtilityCode(GrammarParser.ProgContext prog) {
        StringBuilder utilsCode = new StringBuilder("package parser;\n\npublic class Utils {\n" +
                appendTabs(utilsCode(prog.fieldDeclarations, prog.inherited)));
        int ruleId = 0;
        for (ParserRule rule : prog.parserRules) {
            String func = rule.getBeforeFuncName();
            if (func != null) {
                String suffix = func.replace("void ", "");
                String name = suffix.substring(0, suffix.indexOf('('));
                func = func.replace(name, name + ruleId);
                utilsCode.append("\n\t").append(func).append("\n\t");
                rule.setBeforeFuncName(name + ruleId);
            }
            func = rule.getInsideFuncName();
            if (func != null) {
                String suffix = func.replace("void ", "");
                String name = suffix.substring(0, suffix.indexOf('('));
                func = func.replace(name, name + ruleId);
                utilsCode.append("\n\t").append(func).append("\n\t");
                rule.setInsideFuncName(name + ruleId);
            }
            func = rule.getAfterFuncName();
            if (func != null) {
                String suffix = func.replace("void ", "");
                String name = suffix.substring(0, suffix.indexOf('('));
                func = func.replace(name, name + ruleId);
                utilsCode.append("\n\t").append(func).append("\n\t");
                rule.setAfterFuncName(name + ruleId);
            }
            ++ruleId;
        }
        utilsCode.append("\n}\n");
        return utilsCode.toString();
    }

    private static String appendTabs(String body) {
        return body.lines()
                .map(x -> "\t" + x)
                .collect(joining("\n"));
    }

    private static String utilsCode(Map<String, String> fieldDeclarations, Set<String> inherited) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : fieldDeclarations.entrySet()) {
            result.append("public static class ")
                    .append(entry.getKey())
                    .append(" extends model.NonTerm {\n")
                    .append("\tpublic ")
                    .append(entry.getKey())
                    .append("() {\n\t\tsuper(\"")
                    .append(entry.getKey())
                    .append("\", ")
                    .append(inherited.contains(entry.getKey()))
                    .append(");\n\t}\n\n")
                    .append(appendTabs(entry.getValue()))
                    .append("\n}\n\n");
        }
        return result.toString();
    }

    private static Object generateUtils(String code) {
        final String name = "parser.Utils";
        try {
            return CompilerUtils.CACHED_COMPILER.loadFromJava(name, code).getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("This should never happen");
        }
    }

}
