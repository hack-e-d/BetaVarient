package vijay.projects.betavarient.DesignPatterns.AbstractFactoryPattern;

public class MotorBikeFactory implements VehicleFactory {

    public Vehicle create() {
        return new MotorBike();
    }
}
