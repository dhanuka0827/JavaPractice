package module1.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueMorseRepresentations {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));


    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(String s : words){
            StringBuilder stringBuilder = new StringBuilder();
            for(char c: s.toCharArray()){
                stringBuilder.append(morseCode[c-'a']);
            }
            set.add(stringBuilder.toString());

        }
        return set.size();

    }


}
