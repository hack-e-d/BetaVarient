package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class SearchSorted {

    public int search(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i <= n/2; i++) {
            if(nums[i] == target) {
                return i;
            }
            if(nums[n-1-i] == target) {
                return n-1-i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(new SearchSorted().search(nums,1));
    }
}
