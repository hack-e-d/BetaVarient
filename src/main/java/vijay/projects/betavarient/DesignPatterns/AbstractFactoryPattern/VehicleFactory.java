package vijay.projects.betavarient.DesignPatterns.AbstractFactoryPattern;

public interface VehicleFactory {

    enum VehicleType {
        CAR, MOTORBIKE
    }
    public static VehicleFactory create(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:return new CarFactory();
            case MOTORBIKE:return new MotorBikeFactory();
            default:throw new IllegalArgumentException();
        }
    }

    public Vehicle create();
}
