package vijay.projects.betavarient.MultiThreading;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        FirstThread firstThread = new FirstThread();
        System.out.println("Running Thread : " + firstThread.getName());
//        firstThread.run();
        firstThread.start();
//        firstThread.start();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        System.out.println("Running Thread : " + thread);
        thread.run();
//        Joining threads waiting for threads
        System.out.println("Joining threads waiting for threads");
        Thread thread1 = new FirstThread();
        Thread thread2 = new FirstThread();
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
