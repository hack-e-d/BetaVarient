package vijay.projects.betavarient.JavaGenerics.Video2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Box<K> {
    private K key;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
public class App<T> {

    private Box<Integer> box = new Box<Integer>();

    List<byte[]> memoryHog = new ArrayList<>();

    void run(T t) {

        box.setKey(new Random().nextInt(Integer.MAX_VALUE));
        System.out.println(box.getKey());
        Thread thread = new Thread(new Runnable(){
            public void run() {
                System.out.println("Thread started : " + Thread.currentThread().getName());
                memoryHog.add(new byte[1024 * 100]);
            }
        });
        switch (t.getClass().getName()) {
            case "java.lang.Integer": System.out.println("running app Id = " + t.toString());
            break;
            case "java.lang.String": System.out.println("running app name = " + t.toString());
            break;
            default: System.out.println("running app = " + t.toString());
        }
    }
}
