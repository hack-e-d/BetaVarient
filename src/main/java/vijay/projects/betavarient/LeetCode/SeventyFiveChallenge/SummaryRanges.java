package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/summary-ranges/description/?envType=problem-list-v2&envId=array
public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = nums.length;
        while(j<n)
        {
            while(j<n-1 && nums[j+1] == nums[j]+1)
            {
                j+=1;
            }
            result.add(i == j ? String.valueOf(nums[i]) : String.valueOf(nums[i])+"->"+String.valueOf(nums[j]));
            j+=1;
            i = j;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{1,2,4,6,7,8,9}));
    }
}
