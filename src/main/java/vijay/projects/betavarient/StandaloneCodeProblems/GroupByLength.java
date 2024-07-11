package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByLength {

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
        Map<Integer, List<String>> lengthMap = new HashMap<>();

        for (String word : words) {
            int length = word.length();

            // If the length key doesn't exist, create a new list for that length
            lengthMap.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
        }

        return lengthMap;
    }
}