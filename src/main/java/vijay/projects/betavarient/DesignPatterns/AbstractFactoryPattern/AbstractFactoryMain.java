package vijay.projects.betavarient.DesignPatterns.AbstractFactoryPattern;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        VehicleFactory carFactory = VehicleFactory.create(VehicleFactory.VehicleType.CAR);
        System.out.println(carFactory.create());

        VehicleFactory motorbikeFactory = VehicleFactory.create(VehicleFactory.VehicleType.MOTORBIKE);
        System.out.println(motorbikeFactory.create());
    }
}
