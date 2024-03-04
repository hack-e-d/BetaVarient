package vijay.projects.betavarient.DesignPatterns.FactoryPattern;

import vijay.projects.betavarient.BMW;

public class CarFactory {

    public enum CarType{
        BMW,AUDI
    }
    public static Vehicle create(CarType carType) {
        switch (carType) {
            case BMW:
                return new BMW();
            case AUDI:
                return new Audi();
            default:
                return new Car();
        }
    }
}
