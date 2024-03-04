package vijay.projects.betavarient.DesignPatterns.FactoryPattern;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FactoryMain {

    public static void main(String[] args) {
        Vehicle car = CarFactory.create(CarFactory.CarType.AUDI);
        System.out.println(car);
        Path path = Paths.get("C:/");
        System.out.println(path.getClass());
    }
}
