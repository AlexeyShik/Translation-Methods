import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class ExprUtils {

    public static String setToString(Set<String> set, boolean endlNeed) {
        return (endlNeed && !set.isEmpty() ? "\n" : "")
                + set.stream().map(s -> "int " + s + ";\n").collect(joining());
    }

    public static Set<String> stringToLocals(String str) {
        return Arrays.stream(str.split(", int")).collect(Collectors.toSet());
    }

    public static String appendTabs(String body) {
        return appendTabs(body, 1);
    }

    public static String appendTabs(String body, int amount) {
        String tabs = "\t".repeat(amount);
        return body.lines()
                .map(x -> tabs + x)
                .collect(joining("\n"));
    }

}
