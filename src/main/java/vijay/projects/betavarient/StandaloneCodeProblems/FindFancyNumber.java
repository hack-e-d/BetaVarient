package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class FindFancyNumber {

    private Boolean isFancyNumber(String number, String validator) {
        int numberInt = 0;

        for(char c : number.toCharArray()) {
            numberInt += Character.getNumericValue(c);
        }

        while(numberInt > 10) {
            int temp = numberInt;
            int sum = 0;
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            numberInt = sum;
        }

        return Character.getNumericValue(validator.charAt(0)) == numberInt;
    }

    public static void main(String[] args) {
        FindFancyNumber findFancyNumber = new FindFancyNumber();
        System.out.println(findFancyNumber.isFancyNumber("2457", "9"));
        System.out.println(findFancyNumber.isFancyNumber("2457", "5"));
    }
}
