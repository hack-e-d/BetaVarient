package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.Arrays;

/**
 * I/p : 3[a]2[c]
 * O/p : aaacc
 */
public class PatternPrinting {

    private static void printPattern (String pattern) {
        String[] splits = pattern.split("]");
        for (String split : splits) {
            for (int i = 0; i < Integer.valueOf(split.split("\\[")[0]); i++) {
                System.out.print(split.split("\\[")[1]);
            }
        }
    }

    public static void main(String[] args) {
        printPattern("3[a]2[c2[a]]");
    }
}
