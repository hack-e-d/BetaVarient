package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return nums.length * (nums.length + 1)/2 - sum;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(new MissingNumber().missingNumber(nums));
    }
}
