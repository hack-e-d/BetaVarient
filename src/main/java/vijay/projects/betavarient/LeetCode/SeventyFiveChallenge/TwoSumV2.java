package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.Arrays;

public class TwoSumV2 {

    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        int sum = 0;
        while(r>l) {
            sum = nums[r] + nums[l];
            if (sum == target) {
                return new int[]{l, r};
            }
            if (sum > target) {
                r--;
            }
            else {
                l++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(new TwoSumV2().twoSum(nums, 9)));
    }
}
