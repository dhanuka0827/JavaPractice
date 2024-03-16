package module1.java8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        isStrPalindrome(str);
    }

    private static void isStrPalindrome(String str) {

        int j = str.length();
        System.out.println(IntStream.rangeClosed(0, str.length()/2)
                .noneMatch(i->str.charAt(i)!=str.charAt(j-i-1))?"Yes":"No");

        System.out.println(IntStream.rangeClosed(0, str.length()/2)
                .allMatch(i->str.charAt(i)==str.charAt(j-i-1))?"Yes":"No");

    }
}
