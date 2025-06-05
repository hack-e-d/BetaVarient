package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class TryFinallyInterviewQ {

    public static void main(String[] args) {

        System.out.println(tryFinallyInterview());
    }

    public static int tryFinallyInterview() {
        int i = 5;
        try{
            return i;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
            i++;
        }

        System.out.println(i);
        return -1;
    }
}
