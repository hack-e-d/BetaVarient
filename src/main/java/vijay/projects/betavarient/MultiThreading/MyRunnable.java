package vijay.projects.betavarient.MultiThreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<6; i++) {
            System.out.println(i);
        }
    }
}
