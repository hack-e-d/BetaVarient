package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class CoinChange {

    //TODO: https://youtu.be/H9bfqozjoqs?si=JQfGAYNgoyvQa23R&t=1133
    //Problem link: https://leetcode.com/problems/coin-change/
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        memo[0] = 0;

        for (int i = 1; i <= amount; i++) {
            int min = amount + 1;
            for (int n : coins) {
                if(i - n >= 0)
                    min = Math.min(min, 1 + memo[i-n]);
            }
            memo[i] = min;
        }
        return memo[amount] == amount + 1 ? -1 : memo[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,3,4,5};
        int amount = 7;
        System.out.println(new CoinChange().coinChange(coins, amount));
    }
}
