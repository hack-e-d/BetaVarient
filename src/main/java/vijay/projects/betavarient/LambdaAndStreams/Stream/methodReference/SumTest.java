package vijay.projects.betavarient.LambdaAndStreams.Stream.methodReference;

import java.util.Arrays;
import java.util.List;

public class SumTest {

    public static int addition(int n1, int n2) {
        return n1 + n2;
    }
    public static void main(String[] args) {

        Isum isum = new Isum() {
            @Override
            public int sum(int val1, int val2) {
                return val1 + val2;
            }
        };

//        when there is a single method in the interface (functional interface) then lambda definition can be used.
        Isum isumLambda = (int val1, int val2) -> {
            return val1 + val2;
        };

//        using method reference with existing method
        Isum isumMethodReference = Integer::sum; // the double :: is used to refer to the reference of the addition method inside SumTest class
        Isum isumMethodReferenceAddition = SumTest::addition;
//        we only bother about the arguments in method reference and not the return type of the method the interface can be void and we can use methods with return type but the wise verse isn't allowed.

        int sum = isum.sum(100,332);
        System.out.println(sum);
        sum = isumLambda.sum(32,1233445);
        System.out.println(sum);
        sum = isumMethodReference.sum(4252454,3444334);
        System.out.println(sum);
        System.out.println("Hello, World!");
        List<String> list = Arrays.asList("hi", "vijay", "pv");
        String out = String.join(",",list);
        System.out.println(out);
        System.out.println(Arrays.asList(out.split(",")));
    }
}
