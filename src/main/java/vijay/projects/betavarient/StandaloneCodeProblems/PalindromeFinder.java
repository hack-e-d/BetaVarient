package vijay.projects.betavarient.StandaloneCodeProblems;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PalindromeFinder {

    private String inputString;

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public boolean isPalindrome(StringBuilder testSubString) {
        if(!testSubString.toString().isEmpty() && testSubString.toString().length() > 2 && testSubString.toString().equalsIgnoreCase(testSubString.reverse().toString())) {
            return true;
        }
        return false;
    }

    public Set<String> getPalindromes(String inputString) {
        StringBuilder input = new StringBuilder(inputString);
        StringBuilder var2 = new StringBuilder("");

        Set<String> palindromes = new HashSet<>();
        StringBuilder subString = new StringBuilder("");

        int performanceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            var2 = input;
            for (int j = i + 3; j <= var2.length(); j++) {
                performanceCount++;
                subString.delete(0, subString.length());
                subString.append(var2.substring(i,j));
                if (isPalindrome(subString)) {
                    palindromes.add(subString.toString());
                }
            }
        }
        System.out.println("No of Times loop ran : " + performanceCount);
        return palindromes;
    }

    public static void main(String[] args) {

        PalindromeFinder palindromeFinder = new PalindromeFinder();

        palindromeFinder.setInputString("madamannaaskmrbobtoreferradarlevel");
//        Expected Output "madam", "radar", "ama", "bob", "refer", "efe", "level", "eve", "anna", "ada"
        System.out.println(palindromeFinder.getPalindromes(palindromeFinder.getInputString()));
    }
}
