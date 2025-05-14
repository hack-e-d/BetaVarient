package vijay.projects.betavarient.DataStructures.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    static Comparator<Integer> queuePriority= (a, b) -> b-a;

    public static void main(String[] args) {

//        basicImplementation();
//        comparableImplementation();
        comparatorImplementation();

    }
    private static void basicImplementation() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // in a normal queue we go first in first out but in priority queue we can give a priority.
        // default it is stored in sorted format without the priority comparator
        pq.add(1);
        pq.add(6);
        pq.add(2);
        pq.add(7);
        pq.add(4);

        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    private static void comparableImplementation() {
        Queue<Customer> customers = new PriorityQueue<>();

        customers.offer(new Customer(1, "test", 28));
        customers.offer(new Customer(5, "test", 68));
        customers.offer(new Customer(2, "test", 24));
        customers.offer(new Customer(3, "test", 8));

        while (!customers.isEmpty()) {
            System.out.println("***************************");
            System.out.println("polled customer " + customers.poll().toString());
            System.out.println("Min heap after polling " + customers);
        }
    }

    private static void comparatorImplementation() {
        Queue<CustomerOrder> orders = new PriorityQueue<>(new CustomerOrder());

        orders.offer(new CustomerOrder(1, 5,192.0F,23));
        orders.offer(new CustomerOrder(2, 5,19.9F,3));
        orders.offer(new CustomerOrder(3, 2,12332.0F,2));
        orders.offer(new CustomerOrder(4, 1,122.0F,45));
        orders.offer(new CustomerOrder(5, 3,192.44F,21));

        while (!orders.isEmpty()) {
            System.out.println("***************************");
            System.out.println("polled customer " + orders.poll());
            System.out.println("Min heap after polling " + orders);
        }
    }
}
