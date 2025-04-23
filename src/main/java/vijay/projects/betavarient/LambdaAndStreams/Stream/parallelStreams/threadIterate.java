package vijay.projects.betavarient.LambdaAndStreams.Stream.parallelStreams;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class threadIterate {

    public static void main(String[] args) {

        AtomicInteger temp = new AtomicInteger();
        Stream<Integer> stream = Stream.iterate(1, no -> no < 1000, (no) -> {
            no = no + temp.get();
            temp.set(no);
            return temp.get();
        });

        stream.forEach(System.out::println);

        System.out.println("****************************** FIBONACCI SERIES ******************************");

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .parallel()
                .limit(20)
                .map((int[] ints) -> ints[0] + ints[1])
                .forEachOrdered(System.out::println);

        System.out.println("****************************** PRINTING ARRAY ELEMENTS ******************************");

        List<Integer> arrays = Stream.iterate(0, n -> new Random().nextInt()).limit(30).toList();
        System.out.println(arrays);
    }
}
