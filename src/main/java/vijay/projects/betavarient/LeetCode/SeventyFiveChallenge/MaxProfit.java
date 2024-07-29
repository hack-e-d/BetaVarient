package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

import javax.validation.constraints.Max;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int l = 0, r=1;
        int maxP = 0;

        while( r< prices.length) {
            if(prices[l] < prices[r]) {
                maxP = Math.max(maxP,(prices[r]-prices[l]));
            } else {
                l = r;
            }
            r+=1;
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new MaxProfit().maxProfit(prices));
    }
}
