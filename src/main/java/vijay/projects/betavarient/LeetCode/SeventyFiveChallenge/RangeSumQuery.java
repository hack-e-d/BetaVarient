package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

// https://leetcode.com/problems/range-sum-query-immutable/?envType=problem-list-v2&envId=array
class NumArray {

    int[] prefix;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return left == 0 ? prefix[right] : prefix[right] - prefix[left-1];
    }
}

public class RangeSumQuery {

}
