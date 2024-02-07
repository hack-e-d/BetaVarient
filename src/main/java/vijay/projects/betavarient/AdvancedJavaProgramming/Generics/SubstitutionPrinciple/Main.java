package vijay.projects.betavarient.AdvancedJavaProgramming.Generics.SubstitutionPrinciple;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/*
 * @author vijay pv
 * substitution principle allows using the derived class object for super class variable but LIst of classes does not follow this principle
 * using wild cards to allow accepting of list of either super class and any subclasses
 */
public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        List<Building> buildings = new ArrayList<Building>();

        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        List<Office> offices = new ArrayList<>();

        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

    }

    static void build(vijay.projects.betavarient.AdvancedJavaProgramming.Generics.SubstitutionPrinciple.Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

//    Wild card defined function : <? extends Building> - this allows accepting a list of all classes that extends Building
    static void printBuildings(List<? extends Building> buildings) {
        for (Building building : buildings) {
            System.out.println(building);
        }
    }
}
