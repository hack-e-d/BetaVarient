package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.Arrays;
import java.util.Comparator;


public class SortByBits {

    public int[] sort(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .sorted((a, b) -> {
                    if(Integer.bitCount(a) == Integer.bitCount(b)) {
                        return Integer.compare(a, b);
                    } else {
                        return Integer.compare(Integer.bitCount(a), Integer.bitCount(b));
                    }
                })
                .mapToInt(a -> a)
                .toArray();
    }

    public static void main(String[] args) {
        int[] output = new SortByBits().sort(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(Arrays.toString(output));
        output = new SortByBits().sort(new int[]{1024,512,256,128,64,32,16,8,4,2,1});
        System.out.println(Arrays.toString(output));
    }
}
