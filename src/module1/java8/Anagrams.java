package module1.java8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        isAnagramJava8(str1.toLowerCase(), str2.toLowerCase());
        //isAnagram(str1.toLowerCase(), str2.toLowerCase());
    }

    private static void isAnagram(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean isAnagram = true;
        for(int i = 0; i<str1.length()-1; i++){
            if(chars1[i]!=chars2[i]){
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram?"Anagrams":"Not Anagram");
    }


    private static void isAnagramJava8(String str1, String str2) {

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean isAnagram = Arrays.equals(chars1, chars2);

        /*boolean isAnagram = IntStream.rangeClosed(0, str1.length()-1)
                .allMatch(i->chars1[i]==chars2[i]);*/

        System.out.println(isAnagram?"Anagrams":"Not Anagram");

    }

}
