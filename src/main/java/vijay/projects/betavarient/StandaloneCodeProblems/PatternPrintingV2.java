package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.Stack;

public class PatternPrintingV2 {

    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        StringBuilder res = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index++) - '0');
                }
                counts.push(count);
            } else if (c == '[') {
                result.push(res.toString());
                res = new StringBuilder();
                index++;
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(result.pop());
                int repeatTimes = counts.pop();
                temp.append(res.toString().repeat(repeatTimes));
                res = new StringBuilder(temp.toString());
                index++;
            } else {
                res.append(c);
                index++;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[c2[b]]"));
    }
}
