package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l,r, sum;
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length-2; i++) {
            l = i+1;
            r = nums.length-1;
            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
                if(sum > 0) {
                    r-=1;
                }
                else if(sum < 0) {
                    l+=1;
                }
                else {
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l+=1;
                    while( nums[i] == nums[l-1] && l<r) {
                        l++;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.println(new ThreeSum().threeSum(nums));
    }
}
