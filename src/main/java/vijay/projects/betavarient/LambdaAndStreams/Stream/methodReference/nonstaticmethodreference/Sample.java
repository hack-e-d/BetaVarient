package vijay.projects.betavarient.LambdaAndStreams.Stream.methodReference.nonstaticmethodreference;

public class Sample {

    public static void main(String[] args) {
        IAddition iAddition = new Sample()::doAdd;
    }
    int doAdd(int a, int b) {
        return a+b;
    }

}
