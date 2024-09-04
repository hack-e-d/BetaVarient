package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class IntegerSum {

    public int twoSum(int a, int b) {
        int sum, carry;
        do {
            sum = a ^ b;
            carry = a & b;
            a = sum;
            b = carry << 1;
        } while (carry != 0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new IntegerSum().twoSum(6,2));
    }
}
