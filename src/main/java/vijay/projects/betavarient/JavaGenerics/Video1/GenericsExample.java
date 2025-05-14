package vijay.projects.betavarient.JavaGenerics.Video1;

public class GenericsExample {

    public static void main(String[] args) {
        Aquarium<GoldFish, StarFish> aquarium = new Aquarium(new GoldFish(), new StarFish());

        System.out.println(aquarium);

        GoldFish goldFish1 = aquarium.getFish1();
        StarFish goldFish2 = aquarium.getFish2();
        StarFish goldFish3 = aquarium.getFish2();

        System.out.println(goldFish1 + ", " + goldFish2 + ", " + goldFish3);
    }
}
