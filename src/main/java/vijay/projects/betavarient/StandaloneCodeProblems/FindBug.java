package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
* The bug is hasNext() is checked this makes the loop end before the last element
* */
public class FindBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Create an iterator to iterate over the list
        Iterator<String> iterator = list.iterator();

        // Iterate the list and remove if the fruit is bannana
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                list.remove(fruit);
            }
            System.out.println(fruit);
        }
    }
}
