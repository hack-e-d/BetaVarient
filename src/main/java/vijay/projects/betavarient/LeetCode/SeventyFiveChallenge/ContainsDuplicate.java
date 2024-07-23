package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> checker = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(checker.contains(nums[i])) {
                return true;
            }
            checker.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums));
    }
}
