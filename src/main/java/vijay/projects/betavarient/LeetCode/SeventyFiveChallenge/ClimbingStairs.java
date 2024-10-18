package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class ClimbingStairs {

    public int climbingStairs(int n) {
        int i = 1, j = 1, sum = 0;
        for (int k = 1; k < n; k++) {
            sum = i + j;
            i = j;
            j = sum;
        }
        return sum;
    }

    //TODO:Not accepted as recursion takes more time( recursion is expensive in JAVA as a new stack is set up each time the recursive method is called
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(new ClimbingStairs().climbingStairs(n));
        System.out.println(new ClimbingStairs().climbStairs(n));
    }
}
