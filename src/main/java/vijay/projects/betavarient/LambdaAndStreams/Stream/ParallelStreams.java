package vijay.projects.betavarient.LambdaAndStreams.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> data = nums.parallelStream();

        data.map((n) -> (n*3))
                .sequential()
                .sorted()
                .forEach(System.out::println);
    }
}
