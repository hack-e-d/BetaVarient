package vijay.projects.betavarient.JavaGenerics.Video1;

public class Aquarium<T1, T2> {

    private T1 fish1;
    private T2 fish2;

    public Aquarium(T1 fish1, T2 fish2) {
        this.fish1 = fish1;
        this.fish2 = fish2;
    }

    public T2 getFish2() {
        return fish2;
    }

    public void setFish2(T2 fish2) {
        this.fish2 = fish2;
    }

    public T1 getFish1() {
        return fish1;
    }

    public void setFish1(T1 fish1) {
        this.fish1 = fish1;
    }
}
