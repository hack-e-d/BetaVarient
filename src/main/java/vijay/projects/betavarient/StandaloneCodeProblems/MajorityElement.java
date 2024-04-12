package vijay.projects.betavarient.StandaloneCodeProblems;


import static java.util.Arrays.sort;
//Considering that all the arrays have majority element
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
