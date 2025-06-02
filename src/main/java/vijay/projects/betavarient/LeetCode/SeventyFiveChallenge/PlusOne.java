package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length, c = 0;
        do {
            n--;
            if (n == -1) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
            }
            int temp = digits[n] + 1;
            digits[n] = temp % 10;
            c = temp /10;
        } while(c == 1);
        return digits;
    }

    public static void main(String[] args) {
        int[] output = plusOne(new int[]{9, 9, 9});
        System.out.println(output);
    }
}
