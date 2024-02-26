package vijay.projects.betavarient.DesignPatterns.SingletonPattern.main;

public class RunTimeSingleton {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime(); // inbuilt runtime singleton from jdk in JVM
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.maxMemory());
    }
}
