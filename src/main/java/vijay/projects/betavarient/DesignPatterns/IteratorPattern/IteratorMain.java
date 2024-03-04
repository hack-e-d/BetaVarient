package vijay.projects.betavarient.DesignPatterns.IteratorPattern;

import java.util.ListIterator;

public class IteratorMain {

    public static void main(String[] args) {
        Container container = new Container();

        while(container.hasNext()) {
            System.out.println(container.next());
        }
    }
}
