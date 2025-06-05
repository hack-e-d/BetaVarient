package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import java.util.ArrayList;
import java.util.List;

/*
* find the missing number where certain consecutive  numbers are missing
 */
public class FindMissingNumbers {

    public static List<Integer> findMissingNumbers(int[] nums) {

        for (int num : nums) {
            int i = Math.abs(num) - 1;
            nums[i] = - Math.abs(num);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumbers(new int[]{1, 2, 3, 4, 3, 6}));
    }
}
