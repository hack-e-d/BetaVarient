package vijay.projects.betavarient.LambdaAndStreams.Stream.parallelStreams;

import java.util.stream.IntStream;

public class ParallelStream101 {

    public static void main(String[] args) {
        IntStream stream;

        long startTime, endTime, sequentialTimeTaken, parallelTimeTaken, parallelForEachOrderedTimeTaken;

        System.out.println("********************************** SEQUENTIAL EXECUTION **********************************");

        stream = IntStream.rangeClosed(0,1000);
        startTime = System.currentTimeMillis();
        stream.forEach((n) -> {
            System.out.println(n + " printed by " + Thread.currentThread().getName());
        });
        endTime = System.currentTimeMillis();
        sequentialTimeTaken = endTime - startTime;


        System.out.println("********************************** PARALLEL EXECUTION **********************************");

        stream = IntStream.rangeClosed(0,1000);
        startTime = System.currentTimeMillis();
        stream.parallel().forEach((n) -> {
            System.out.println(n + " printed by " + Thread.currentThread().getName());
        });
        endTime = System.currentTimeMillis();
        parallelTimeTaken = endTime - startTime;

        System.out.println("********************************** PARALLEL FOREACH-ORDERED EXECUTION **********************************");

        stream = IntStream.rangeClosed(0,1000);
        startTime = System.currentTimeMillis();
        stream.parallel().forEachOrdered((n) -> {
            System.out.println(n + " printed by " + Thread.currentThread().getName());
        });
        endTime = System.currentTimeMillis();
        parallelForEachOrderedTimeTaken = endTime - startTime;

        System.out.println("Number of cores: " + Runtime.getRuntime().availableProcessors());

        System.out.println("Time taken for sequential : " + sequentialTimeTaken + " ms");
        System.out.println("Time taken for parallel : " + parallelTimeTaken  + " ms");
        System.out.println("Time taken for parallel foreach-ordered : " + parallelForEachOrderedTimeTaken  + " ms");
    }
}
