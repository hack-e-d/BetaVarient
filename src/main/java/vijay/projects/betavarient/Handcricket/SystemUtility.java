package vijay.projects.betavarient.Handcricket;

import java.util.Random;
import java.util.Scanner;

public class SystemUtility {

    private Random systemRandomizer;
    private Scanner scanner;

    public SystemUtility() {
        this.systemRandomizer = new Random();
        this.scanner = new Scanner(System.in);
    }

    public Random getSystemRandomizer() {
        return this.systemRandomizer;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public boolean toss() {
        int systemTossCall = getSystemRandomizer().nextInt() % 6 + 1;
//        true is odd and false is even
        System.out.println("Enter the toss call :");
        int userTossCall = getScanner().nextInt();
        System.out.println("Enter odd or even (1 for odd and 2 for even) : ");
        boolean userOddEven = scanner.nextInt() == 1 ? true : false;
        if (((systemTossCall + userTossCall) % 2 == 0 && !userOddEven) || ((systemTossCall + userTossCall) % 2 == 1 && userOddEven)) {
            return true;
        }
        return false;
    }

    public boolean isOut(int systemInput, int userInput) {
        return systemInput == userInput ? true : false;
    }

    public int systemOutput() {
        return getSystemRandomizer().nextInt() % 6 + 1;
    }

    public int getUserInput() {
        System.out.println("Enter the next number : ");
        return getScanner().nextInt();
    }

    public boolean systemChoice() {
//        true is batting
        return getSystemRandomizer().nextBoolean();
    }

    public boolean getUserChoice() {
        System.out.println("Enter the choice batting or bowling (1 for batting and 2 for bowling) : ");
        return (getScanner().nextInt() == 1 ? true : false);
    }

    public void getWinner(long systemScore, long userScore) {
        if (systemScore > userScore) {
            System.out.println("********* User 1 Lost the Game :( *********");
        } else if (userScore > systemScore) {
            System.out.println("********* User 1 Won the Game !!! *********");
        } else {
            System.out.println("********* DRAW MATCH *********");
        }
    }
}
