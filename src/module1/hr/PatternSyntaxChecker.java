package module1.hr;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            patternSyntaxChecker(pattern);
            testCases--;
        }
    }

    private static void patternSyntaxChecker(String pattern) {
        Pattern p = null;
        try {
            p = Pattern.compile(pattern);
        }catch (PatternSyntaxException ex){
            System.out.println("Invalid");
        }
        if(p!=null){
            System.out.println("Valid");
        }
    }
}
