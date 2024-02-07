package vijay.projects.betavarient.AdvancedJavaProgramming.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
    static Character[] characters = {'h','g','d','w','e'};
    static Integer[] integers = {1,2,3,4,5,6};
    static Boolean[] booleans = {true,false,true};

    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

//    varargs - variable number of arguments allows to pass one items, two items and array of items
    public static void printShoppingList(String... items) {
        System.out.println("******************SHOPPING LIST******************");

        for (String item : items) {
            System.out.println(".) " + item);
        }
    }
    public static void main(String[] args) {
        List<Character> characterList = arrayToList(characters, new ArrayList<>());
        List<Boolean> booleanList = arrayToList(booleans, new ArrayList<>());
        List<Integer> integerList = arrayToList(integers, new ArrayList<>());

        System.out.println(characterList);
        System.out.println(booleanList);
        System.out.println(integerList);

        String item1 = "Apple";
        String item2 = "Banana";
        String[] items = {"apple", "banana", "carrot"};

        printShoppingList(item1);
        printShoppingList(item1, item2);
        printShoppingList(items);
    }
}
