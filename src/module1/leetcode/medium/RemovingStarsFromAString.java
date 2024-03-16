package module1.leetcode.medium;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        String s = "*eec***";
        String newStr = removeStars(s);
        System.out.println("."+newStr+".");
    }

    private static String removeStars(String s) {
        char[] chars = s.toCharArray();
        Stack<String> stack = new Stack<>();
        for(int i =0; i< chars.length; i++){
            if(chars[i]=='*'){
                if(stack.size()>0)
                    stack.pop();
            }else {
                stack.push(chars[i]+"");
            }
        }
        return stack.stream().map(str -> str.toString()).collect(Collectors.joining(""));
    }

}
