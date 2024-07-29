package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.Arrays;

public class MaxProduct {

//    Failed to address issue with zero
    public static int maxProduct1(int[] nums) {
        int maxP = nums[0];
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            p = 1;
            for (int j = i; j < nums.length; j++) {
                p *= nums[j];
                maxP = Math.max(maxP, p);
            }
        }
        return maxP;
    }
    public static int maxProduct2(int[] nums) {
        int n = nums.length, res = nums[0], l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            l =  (l == 0 ? 1 : l) * nums[i];
            r =  (r == 0 ? 1 : r) * nums[n - 1 - i];
            res = Math.max(res, Math.max(l, r));
        }
        return res;
    }
    public static int maxProduct(int[] nums) {
        int res = Arrays.stream(nums).max().getAsInt();
        int cmax = 1, cmin = 1;
        for (int n : nums) {
            if(n == 0) {
                cmax = cmin = 1;
            }
            int oldCMax = cmax;
            cmax = Math.max(n, Math.max(oldCMax*n, cmin*n));
            cmin = Math.min(n, Math.min(oldCMax*n, cmin*n));
            res = Math.max(res, cmax);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0}, nums2 = {-2,0,-1}, nums3 = {-2};
        System.out.println(maxProduct(nums));
        System.out.println(maxProduct2(nums));
//        System.out.println(maxProduct(nums2));
//        System.out.println(maxProduct(nums3));
    }
}
