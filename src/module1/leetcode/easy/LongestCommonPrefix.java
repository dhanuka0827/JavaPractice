/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */


package module1.leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        //String[] strs = {"flower","flown", "flowed", "flo"};
        String[] strs = {"flower","flown", "flowed", "flo", "hello", "fhe"};
        //String[] strs = {"flower","flown","flowed", "flo", "hello", "fhe"};
        System.out.println(Arrays.toString(strs));
        String prefix = obj.longestCommonPrefix(strs);
        System.out.println("Prefix:" + prefix);
    }

    private String longestCommonPrefix(String[] strs) {
        String first ="";
        String second = "";
        String pr="";
        String sub = "";

        for(int i =0; i<strs.length-1;i++){
            first = pr.isEmpty()?strs[i]:pr;
            second = strs[i+1];
            sub = "";
            //pr="";
            System.out.println("\n\nFirst: "+first.length()+" Second: "+second.length());
            for(int j =1; j<=(first.length() & second.length());j++) {
                System.out.println("\nj : "+j);

                sub = first.substring(0, j);
                System.out.println("Sub :"+sub);
                if (second.startsWith(sub)) {
                    continue;
                }
                else {
                    sub="";
                    break;
                }
            }
            if(!sub.isEmpty()){
                pr=sub;
                System.out.println("PR: "+pr);
            }
            if(pr.isEmpty())
                break;
        }
        return pr;
    }

 /*   public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String commonPrefix = "";
        String pr = "";
        String sub = "";
        boolean startsWithPrefix = false;

        int words = strs.length;
        int i = 0;
        //for(int i =0;i<words-1;i++){
        String first = strs[i];
        String second ="";

        if(words>2) {
            second = strs[i + 1];
        }
        System.out.println("first:" + first + ", second:" + second);
        for (int j = 1; j <= first.length(); j++) {
            sub = first.substring(0, j);
            System.out.println(sub);
            if (second.startsWith(sub)) {
                commonPrefix = sub;
            }
            else {
                break;
            }
                *//*else if (!commonPrefix.isEmpty()) {
                    return commonPrefix;
                } else
                    return "";*//*
        }
        if (commonPrefix.isEmpty()) {
            return "";
        }else if(words>2){
            for (int j = 2; j < words - 1; j++) {
                if (strs[j].startsWith(commonPrefix)) {
                    startsWithPrefix = true;
                } else {
                    startsWithPrefix = false;
                    break;
                }
            }
            if(startsWithPrefix)
                return commonPrefix;
            else return "";
        }
        //System.out.println("Common prefix:" + commonPrefix);
        return commonPrefix;
    }*/

}
