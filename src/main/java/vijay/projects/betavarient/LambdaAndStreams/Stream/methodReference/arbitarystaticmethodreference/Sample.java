package vijay.projects.betavarient.LambdaAndStreams.Stream.methodReference.arbitarystaticmethodreference;

// reference https://www.youtube.com/watch?v=Gi1ClHCEYvk
public class Sample {

    public static void main(String[] args) {

        IAddition iAddition = Sample::doAdd;
        System.out.println(iAddition.add(new Sample(), 10, 20));
    }

    int doAdd(int a, int b) {
        return a+b;
    }
}
