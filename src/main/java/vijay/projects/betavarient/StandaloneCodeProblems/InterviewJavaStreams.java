package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewJavaStreams {

    public static void main(String[] args) {
        List names = List.of("name1","name2","name3");
        Stream strm1 = names.stream();
        strm1.filter(name -> names.contains("name")).forEach(System.out::println);
        strm1.forEach(System.out::println);
        System.out.println(strm1.count());
//        mapAndFlatMap();
    }

    private static void mapAndFlatMap() {
        List<String> words = Arrays.asList("hello", "world", "java");

        // Using map() to get the length of each word
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Word lengths (using map()): " + wordLengths); // Output: [5, 5, 4]

        List<List<Integer>> numbersList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6)
        );

        // Using map() to square each list (results in a Stream of Lists)
        List<List<Integer>> squaredListsUsingMap = numbersList.stream()
                .map(list -> list.stream().map(n -> n * n).collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println("Squared lists (using map()): " + squaredListsUsingMap); // Output: [[1, 4, 9], [16, 25], [36]]

        // Using flatMap() to square each number and flatten the result
        List<Integer> squaredNumbersUsingFlatMap = numbersList.stream()
                .flatMap(list -> list.stream().map(n -> n * n))
                .collect(Collectors.toList());
        System.out.println("Squared numbers (using flatMap()): " + squaredNumbersUsingFlatMap); // Output: [1, 4, 9, 16, 25, 36]

        List<String> sentences = Arrays.asList("hello world", "java streams");

        // Using flatMap() to split sentences into individual words
        List<String> allWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println("All words (using flatMap()): " + allWords); // Output: [hello, world, java, streams]
    }
}
