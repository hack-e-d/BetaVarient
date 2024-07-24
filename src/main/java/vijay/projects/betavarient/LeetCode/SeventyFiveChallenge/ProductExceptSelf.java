package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.Arrays;

public class ProductExceptSelf {
//    This uses division with shouldn't as per problem
    public int[] productExceptSelf1(int[] nums) {
        int tp = 1;
        int zeroCount = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] != 0){
                tp *= nums[i];
            } else {
                zeroCount ++;
            }

        }
        int[] op = new int[nums.length];
        for(int i = 0; i<nums.length; i++) {
            if(zeroCount > 1) {
                op[i] = 0;
            } else if (zeroCount > 0 && nums[i] != 0) {
                op[i] = 0;
            } else if(zeroCount > 0 && nums[i] == 0) {
              op[i] = tp;
            } else {
                op[i] = tp/nums[i];
            }
        }
        return op;
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, ans[] = new int [n];
        Arrays.fill(ans, 1);
        int temp = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= temp;
            temp *= nums[i];
        }
        temp = 1;
        for(int i = n-1; i >= 0; i--) {
            ans[i] *= temp;
            temp *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,4,0}, nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf(nums2)));
    }
}
