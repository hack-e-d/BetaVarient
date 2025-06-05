package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/description/
public class FindMissingNumber {

    public static int findMissingNumber(int[] nums) {
        return ((nums.length) * (nums.length+1) /2) - Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{0, 1, 3, 4, 2, 6, 7, 8, 9, 10}));
    }
}
