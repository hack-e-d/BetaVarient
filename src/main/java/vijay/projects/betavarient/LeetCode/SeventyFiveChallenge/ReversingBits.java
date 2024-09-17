package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class ReversingBits {

    public int reversingBits(int n) {
        int m = 0;
        while(n > 0) {
            m += n % 2;
            m<<=1;
            n>>=1;
        }
        return m;
    }

    public static void main(String[] args) {
        int n = 429496729;
        System.out.println(new ReversingBits().reversingBits(n));
    }
}
