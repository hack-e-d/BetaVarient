package vijay.projects.betavarient.LambdaAndStreams.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class LazyStreams {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);

        Stream<Integer> integerStream1 = integerStream.filter(n -> {
            System.out.println("Filter running........  "+n);
            return n >= 3;
        });

        Stream<Integer> integerStream2 = integerStream1.map(n -> {
           return n*n;
        });

//        integerStream2.forEach(System.out::println);
    }
}
