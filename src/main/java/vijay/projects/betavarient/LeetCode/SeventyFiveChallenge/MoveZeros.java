package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for(int r = 0; r < nums.length; r++) {
            if(nums[r] != 0) {
                nums[left] = nums[r] + nums[left];
                nums[r] = nums[left] - nums[r];
                nums[left] = nums[left] - nums[r];
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
