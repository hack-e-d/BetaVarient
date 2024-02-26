package vijay.projects.betavarient.DesignPatterns.SingletonPattern.main;

/*
* This is the worst way in which the synchronization problem can be solved.
 */
public class SynchronizedBlockSingleton {

    private static SynchronizedBlockSingleton SINGLETON = null;

    private SynchronizedBlockSingleton(){

    }

    public static synchronized SynchronizedBlockSingleton getInstance() {

//        Sync block is executed only when there is no SINGLETON instance created
        if(SINGLETON == null) {
//            The below NULL check is done cause when multiple threads enter the first if condition on first try then the inner if makes sure a second level of checking is done
//            to prevent multiple instance creation
            synchronized (SynchronizedBlockSingleton.class) {
                if(SINGLETON == null) {
                    SINGLETON = new SynchronizedBlockSingleton();
                }
            }
        }
        return SINGLETON;
    }
}
