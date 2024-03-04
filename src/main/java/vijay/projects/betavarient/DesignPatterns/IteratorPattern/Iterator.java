package vijay.projects.betavarient.DesignPatterns.IteratorPattern;

import java.util.stream.IntStream;

public interface Iterator {

    boolean hasNext();
    int next();
    int get();
    boolean hasPrevious();
    int previous();
}
