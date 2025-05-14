package vijay.projects.betavarient.JavaGenerics.Video2;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class Example {

    public static void main(String[] args) {

        App<Integer> app = new App<Integer>();

        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        long maxMemory = memoryMXBean.getHeapMemoryUsage().getMax(); // Get max heap memory.
        long usedMemory;

        // Example loop (replace with your actual loop condition)
        while (true) {
            app.run(1);

            usedMemory = memoryMXBean.getHeapMemoryUsage().getUsed();
            System.out.println("Used Memory: " + usedMemory);
            System.out.println("Total Memory: " + maxMemory);

            // Check if used memory is approaching a threshold (e.g., 90% of max)
            if (usedMemory > 0.9 * maxMemory) {
                System.out.println("Memory usage threshold reached. Exiting loop.");
                break; // Exit the loop
            }
        }
        System.out.println("Loop finished.");
    }
}
