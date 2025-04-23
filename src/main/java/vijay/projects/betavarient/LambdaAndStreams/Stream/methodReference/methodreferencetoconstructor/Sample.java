package vijay.projects.betavarient.LambdaAndStreams.Stream.methodReference.methodreferencetoconstructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Sample {

    public static void main(String[] args) {
        Supplier<Employee> employeeSupplier = Employee::new;
        Employee employee = employeeSupplier.get();
        System.out.println(employee.toString());

        Function<Integer, Employee> employeeGenerator = Employee::new;
        System.out.println(employeeGenerator.apply(10).toString());

        BiFunction<Integer, String, Employee> employeeBiFunction = Employee::new;
        System.out.println(employeeBiFunction.apply(12,"vijay").toString());
    }
}
