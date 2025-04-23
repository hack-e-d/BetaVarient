package vijay.projects.betavarient.JavaGenerics.Video1;

public class GenericsExample {

    public static void main(String[] args) {
        Aquarium<GoldFish, FighterFish> aquarium = new Aquarium(new GoldFish(), new FighterFish());

        System.out.println(aquarium);

        GoldFish goldFish1 = aquarium.getFish1();
        FighterFish goldFish2 = aquarium.getFish2();
        FighterFish goldFish3 = aquarium.getFish2();

        System.out.println(goldFish1 + ", " + goldFish2 + ", " + goldFish3);
    }
}
