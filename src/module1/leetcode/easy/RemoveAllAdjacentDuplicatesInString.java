package module1.leetcode.easy;

import javax.sound.midi.Soundbank;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        //String s = "azxxzy";
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    /*public static String removeDuplicates(String s) {
        Stack<String> stringStack = new Stack<>();
        char[] charArray = s.toCharArray();
        stringStack.push(charArray[0]+"");
        for(int i =1; i<charArray.length; i++){
            if(stringStack.size()>0 && (charArray[i]+"").equals(stringStack.peek())){
                if(stringStack.size()>0)
                    stringStack.pop();
            }else{
                stringStack.push(charArray[i]+"");
            }
        }
        return stringStack.stream()
                .map(str->str.toString())
                .collect(Collectors.joining(""));
    }*/
    public static String removeDuplicates(String s) {
        Stack<String> stringStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stringStack.size()>0 && (c+"").equals(stringStack.peek())){
                    stringStack.pop();
            }else{
                stringStack.push(c+"");
            }
        }
        return stringStack.stream()
                .map(str->str.toString())
                .collect(Collectors.joining(""));
    }
}
