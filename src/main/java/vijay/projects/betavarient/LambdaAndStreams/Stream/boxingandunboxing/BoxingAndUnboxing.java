package vijay.projects.betavarient.LambdaAndStreams.Stream.boxingandunboxing;

import java.util.ArrayList;
import java.util.List;

/*
* Boxing and UnBoxing (Auto-boxing and Auto-UnBoxing):
*       auto boxing is the process of converting a primitive datatype into and wrapper class object by the compiler itself
*       Auto unboxing is the reverse process of converting a wrapper class to primitive datatype by the compiler itself
* */
public class BoxingAndUnboxing {

    public static void main(String[] args) {
//        Boxing
        int i = 10;
        System.out.println(Integer.valueOf(i));

//        Auto-boxing
        Integer integer = i;
        System.out.println(integer);

//        Auto boxing
        List<Integer> intList = new ArrayList<>();
        intList.add(1); // Auto boxing
        intList.add(Integer.valueOf(2)); // Boxing

//        Auto Unboxing
        {
            int j = intList.get(0); // Auto-UnBoxing
            System.out.println(intList.get(0).getClass().getName());
            System.out.println(j);
        }

        //        Unboxing
        {
            Integer j =intList.get(0); // Auto-UnBoxing
            System.out.println(j.intValue());
        }


    }
}
