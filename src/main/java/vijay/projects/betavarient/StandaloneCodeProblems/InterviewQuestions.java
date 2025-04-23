package vijay.projects.betavarient.StandaloneCodeProblems;

import java.util.Arrays;
import java.util.List;

public class InterviewQuestions {

    public static void main(String[] args) {

        List list = Arrays.asList("A", "B", "C");
        list.stream().filter(data -> "A".equals(data));
        list.stream().count();

        
        String str = null;
        if(str.equals("Data")) {
            System.out.println("matched...");
        }
    }
}
