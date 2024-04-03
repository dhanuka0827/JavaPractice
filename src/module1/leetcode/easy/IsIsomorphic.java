package module1.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("title","paper"));
        System.out.println(isIsomorphic("badc","baba"));
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        if(s.length()!=t.length())
            return false;

        for(int i =0;i<sChar.length;i++){
            if(sMap.containsKey(sChar[i])){
                if(!sMap.get(sChar[i]).equals(tChar[i])){
                return false;
                }
            }else
                sMap.put(sChar[i], tChar[i]);
            if(tMap.containsKey(tChar[i])){
                if(!tMap.get(tChar[i]).equals(sChar[i])){
                    return false;
                }
            }else
                tMap.put(tChar[i], sChar[i]);
        }
        /*for(int i =0;i<tChar.length;i++){
            if(tMap.containsKey(tChar[i])){
                if(!tMap.get(tChar[i]).equals(sChar[i])){
                    return false;
                }
            }else
                tMap.put(tChar[i], sChar[i]);
        }*/
        return true;

    }
}
