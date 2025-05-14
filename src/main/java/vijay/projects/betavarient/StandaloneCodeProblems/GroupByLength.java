package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GroupByLength {

    private static Predicate<String> lengthCheck = s -> s.length() >= 4;

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("fig");
        words.add("grape");

        Map<Integer, List<String>> groupedWords = groupByLength(words);

        System.out.println(groupedWords);
    }

    public static Map<Integer, List<String>> groupByLength(List<String> words) {
        Map<Integer, List<String>> lengthMap = words.stream()
                .filter(lengthCheck)
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.toList()));

        return lengthMap;
    }
}