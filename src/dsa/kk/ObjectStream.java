package dsa.kk;

//function - reverse a string using recursion

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ObjectStream {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        /*int[] arr = {3,6,7,9};
        findPairs(arr, 9);*/

        /*List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("aha");
        System.out.println(returnPalindrome(list));*/
    }

    /*
    Find all pairs of integer arrays whose sum is equal to a given number?
    arr: {3, 6, 7, 9}
    number: 9
    output: {3, 6}
    [{3,6}]
     */
    public static void findPairs(int[] array, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: array){
            map.put(i, 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int first = entry.getKey();
            int second = sum - first;
            if(map.containsKey(second) && map.get(second)>0){
                map.put(first, 0);
                System.out.println("Pair is :"+first+", " +second);
            }
        }
    }

    private static String reverseString(String str){
        if(str.isBlank()){
            return "";
        }else
            return reverseString(str.substring(1))+str.charAt(0);
    }

    //list of strings as input
    //remove the non palindrome from list

    private static List<String> returnPalindrome(List<String> list){
        return list.stream().filter(str->str.equals(reverseString(str))).collect(Collectors.toList());
    }

    }
