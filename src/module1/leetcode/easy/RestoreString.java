package module1.leetcode.easy;

import java.util.Arrays;

public class RestoreString {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet", indices));
    }
    public static String restoreString(String s, int[] indices) {

        char[] chars = s.toCharArray();
        char[] newChars = new char[s.length()];
        int j = 0;
        for(int i : indices){
            char ch = chars[j];
            newChars[i] = ch;
            j++;
        }
        return new String(newChars);

    }
}
