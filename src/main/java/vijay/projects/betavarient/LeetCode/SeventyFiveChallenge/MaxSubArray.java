package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int csum = 0;
        for (int n : nums) {
            csum = Math.max(csum, 0);
            csum = csum + n;
            maxSub = Math.max(maxSub, csum);
        }
        return maxSub;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaxSubArray().maxSubArray(nums));
    }
}
