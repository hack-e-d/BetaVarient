package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;
//For sorted rotated array
public class FindMin {
    public static int findMin(int[] nums) {
        int m = nums.length/2, l = 0, r = nums.length-1;
        int res = nums[m];
        while (l <= r) {
            if(nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }
            m = (l+r)/2;
            res = Math.min(nums[m], res);
            if(nums[m] >= nums[l]) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}
