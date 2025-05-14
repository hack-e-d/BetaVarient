package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingMappingJavaStreams {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("hello", "world123", "hello", "world123", "world123", "world123");

        Map<Integer, Long> map = stringList.stream()
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.counting()));

        System.out.println(map);

        System.out.println(stringList.stream()
                .collect(Collectors.summingInt(s -> s.length())));

        String word = "hello";

        Map<Character, Integer> characterCount = new HashMap<>();

        for (char c : word.toCharArray()) {
            characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
        }


        System.out.println(characterCount);

        SortedMap<Character, Integer> sortedMap = new TreeMap<>(characterCount);
        System.out.println(sortedMap);
    }
}
