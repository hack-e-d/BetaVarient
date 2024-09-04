package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class HammingWeight {

    public int getHammingWeight(int n) {
        int count = 0;
        while(n > 0) {
            count = n % 2 == 1 ? count + 1 : count;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new HammingWeight().getHammingWeight(4));
    }
}
