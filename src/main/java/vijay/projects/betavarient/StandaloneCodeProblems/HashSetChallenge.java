package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.HashSet;

class Country {
    public String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class HashSetChallenge {

    public static void main(String[] args) {

        String s1 = new String("India");
        String s2 = new String("India");
        Country c1 = new Country("France");
        Country c2 = new Country("France");

        HashSet hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(c1);
        hashSet.add(c2);
        System.out.println(hashSet);
    }
}
