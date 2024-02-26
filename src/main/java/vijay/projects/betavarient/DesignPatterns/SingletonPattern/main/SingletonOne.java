package vijay.projects.betavarient.DesignPatterns.SingletonPattern.main;

/*
* This type for singleton implementation works only on single threaded apps, in MultiThreaded apps if multiple threads call the getInstance()
* simultaneously then there is a chance multiple instances of the class would get created.
 */
public class SingletonOne {

    private static SingletonOne SINGLETON = null;

    private SingletonOne(){

    }

    public static SingletonOne getInstance() {

        if(SINGLETON == null) {
            SINGLETON = new SingletonOne();
        }
        return SINGLETON;
    }
}
