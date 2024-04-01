package module1.leetcode.easy;

public class LengthOfLastWord {

    public static void main(String[] args) {
        //String str = "Hello World";
        String str = "             ";
        System.out.println(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String s) {
        String [] strings = s.strip().split(" ");
        return strings[strings.length-1].length();
    }
}
