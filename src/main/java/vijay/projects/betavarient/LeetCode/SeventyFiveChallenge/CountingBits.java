package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.Arrays;

public class CountingBits {

    private int getHammingWeight(int n) {
        int count = 0;
        while(n > 0) {
            count = n % 2 == 1 ? count + 1 : count;
            n >>= 1;
        }
        return count;
    }

    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            result[i] = getHammingWeight(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountingBits().countBits(5)));
    }
}
