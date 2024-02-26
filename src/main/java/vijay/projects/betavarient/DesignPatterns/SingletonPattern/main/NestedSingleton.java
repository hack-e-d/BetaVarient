package vijay.projects.betavarient.DesignPatterns.SingletonPattern.main;

/*
* This type for singleton implementation works only on single threaded apps, in MultiThreaded apps if multiple threads call the getInstance()
* simultaneously then there is a chance multiple instances of the class would get created.
 */
public class NestedSingleton {
    private NestedSingleton(){

    }

    private static final class SingletonHolder {
        private static final NestedSingleton SINGLETON = new NestedSingleton();
    }
    public static NestedSingleton getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
