package vijay.projects.betavarient.DesignPatterns.SingletonPattern.main;

/*
* This is the worst way in which the synchronization problem can be solved.
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton SINGLETON = null;

    private SynchronizedSingleton(){

    }

    public static synchronized SynchronizedSingleton getInstance() {

        if(SINGLETON == null) {
            SINGLETON = new SynchronizedSingleton();
        }
        return SINGLETON;
    }
}
