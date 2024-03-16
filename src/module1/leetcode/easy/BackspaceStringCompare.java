package module1.leetcode.easy;

import java.util.Stack;
import java.util.stream.Collectors;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s ="ab#c";
        String t = "ad#c";
        boolean value = backspaceCompare(s, t);
        System.out.println(value);
    }
    public static boolean backspaceCompare(String s, String t) {
        String newS = removeBackspace(s);
        String newT = removeBackspace(t);
        return newS.equals(newT);
    }

    public static String removeBackspace(String s){
        char[] charArray = s.toCharArray();
        Stack<String> stringStack  = new Stack<>();
        for(char c : charArray){
            if(c=='#'){
                if(stringStack.size()>0){
                    stringStack.pop();
                }
            }else{
                stringStack.push(c+"");
            }
        }
        return stringStack.stream()
                .map(str->str.toString())
                .collect(Collectors.joining(""));
    }
}
