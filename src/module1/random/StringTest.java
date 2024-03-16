package module1.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringTest implements Cloneable {

    public static void main(String[] args) {
        String str = "ac#b#erjwor";
        System.out.println(str.startsWith("a"));
        System.out.println(str.startsWith("ac"));
        System.out.println(str.startsWith("ac#"));
        System.out.println(str.startsWith("ac#b#"));
    }

    private static void newMethod(){
        List<String> newList = null;
        if(newList!=null && newList.size()>0){
            System.out.println("list is not null");
        }else {
            System.out.println("list is null");
        }
    }

    public static void givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
    }
}
