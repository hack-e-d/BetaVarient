package vijay.projects.betavarient.LambdaAndStreams.Stream.methodReference.methodreferenceandstreams;

import antlr.StringUtils;
import vijay.projects.betavarient.LambdaAndStreams.Stream.methodReference.methodreferencetoconstructor.Employee;

import java.util.List;
import java.util.function.Function;

public class StreamsAndMethodReferences {

    private static List<String> names = List.of("vijay", "jhon", "grey", "danny");

    public static void main(String[] args) {

        Function<String, String> toCamelCase = init -> {
            {
                if (init == null)
                    return null;

                final StringBuilder ret = new StringBuilder(init.length());

                for (final String word : init.split(" ")) {
                    if (!word.isEmpty()) {
                        ret.append(Character.toUpperCase(word.charAt(0)));
                        ret.append(word.substring(1).toLowerCase());
                    }
                    if (!(ret.length() == init.length()))
                        ret.append(" ");
                }

                return ret.toString();
            }
        };
        names
                .stream()
                .map(Employee::new)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .map(toCamelCase)
                .forEach(System.out::println);
    }
}
