package vijay.projects.betavarient.LambdaAndStreams.Stream.methodReference.staticmethodreference;

public class Sample {

    public static void main(String[] args) {

        IAddition iAddition = Sample::doAdd;

        System.out.println(iAddition.add(12,23));
    }

    static int doAdd(int a, int b) {
        return a+b;
    }
}
