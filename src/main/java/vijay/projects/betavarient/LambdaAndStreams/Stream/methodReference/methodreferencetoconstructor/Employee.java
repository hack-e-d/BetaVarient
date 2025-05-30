package vijay.projects.betavarient.LambdaAndStreams.Stream.methodReference.methodreferencetoconstructor;

import java.util.Random;

public class Employee {

    private static final Random rand = new Random();

    private int id;

    private String name;

    public Employee() {}

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
        this.id = rand.nextInt(100);
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name    = name ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
