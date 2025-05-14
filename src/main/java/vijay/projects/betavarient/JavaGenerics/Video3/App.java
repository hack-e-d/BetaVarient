package vijay.projects.betavarient.JavaGenerics.Video3;

import java.util.Arrays;
import java.util.List;

public class App {

//    this takes soo much overloading to be needed but this can be simplified it can be converted to generics
    public void showItem(Integer data) {
        System.out.println("item is : " + data);
    }

    public void showItem(String data) {
        System.out.println("item is : " + data);
    }

    public void showItem(Double data) {
        System.out.println("item is : " + data);
    }

    public void showItem(Character data) {
        System.out.println("item is : " + data);
    }

//    Generic method creation the <T> used to mention the type that is passed with the method
    public <T> void genericShowItem(T data) {
        System.out.println("item is : " + data);
    }

    public static <K> void printArrayList(List<K> arrayList) {
        for (K k : arrayList) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {

        new App().showItem(100);
        new App().showItem("100 hello");
        new App().showItem('c');
        new App().showItem(123.66);

        new App().<Integer>genericShowItem(100);
        new App().genericShowItem("100 hello");
        new App().genericShowItem('c');
        new App().genericShowItem(123.66);

        printArrayList(Arrays.asList("hello", "test", "blh blah"));
    }
}
