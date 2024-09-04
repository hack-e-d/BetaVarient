package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class MostWater {

    public int maxArea(int[] height) {
        int l = 0, r = height.length-1, area = 0;
        while(l<r) {
            area = Math.max(area, (Math.min(height[l],height[r]) * (r-l)));
            if(height[l]>height[r]) {
                r--;
            }
            else {
                l++;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(new MostWater().maxArea(heights));
    }
}
