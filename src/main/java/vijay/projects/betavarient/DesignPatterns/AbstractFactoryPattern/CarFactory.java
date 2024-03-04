package vijay.projects.betavarient.DesignPatterns.AbstractFactoryPattern;

public class CarFactory implements VehicleFactory {

    public Vehicle create() {
        return new Car();
    }
}
