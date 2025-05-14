package vijay.projects.betavarient.JavaGenerics.Video2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class RawToGeneric {
    public static void main(String[] args) {
        // Raw type (no type parameter)
        List rawList = new ArrayList();
        rawList.add("hello");
        rawList.add("123"); // No compile-time error

        // Generic type
        List<String> stringList = new ArrayList<>();

        // Assigning the raw type to the generic type
        stringList = rawList; // Compiler issues an unchecked conversion warning

        // Now, if you try to use stringList expecting only Strings, you might encounter issues
        for (String s : stringList) { // This will throw a ClassCastException at runtime
            System.out.println(s.toUpperCase());
        }
        stringList.stream().dropWhile(s -> !s.isEmpty()).forEach(System.out::println);
    }
}