package vijay.projects.betavarient.DesignPatterns.SingletonPattern.main;

//
public class SingletonMain {

    public static void main(String[] args) {


        SingletonOne singletonOne = SingletonOne.getInstance();
        System.out.println(singletonOne.hashCode());
        SingletonOne singletonOne1 = SingletonOne.getInstance();
        System.out.println(singletonOne1.hashCode());
        System.out.println(singletonOne1 == singletonOne);
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        System.out.println(synchronizedSingleton);
        SynchronizedBlockSingleton synchronizedBlockSingleton = SynchronizedBlockSingleton.getInstance();
        System.out.println(synchronizedBlockSingleton);
    }
}
