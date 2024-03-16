/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
*/

package module1.leetcode.easy;


import java.util.Scanner;

public class RomanToInteger {

    public static int symbolValue(char symbol){
        int val =0;
        switch(symbol){
            case 'I':
               val = 1;
               break;
            case 'V':
                val = 5;
                break;
            case 'X':
                val = 10;
                break;
            case 'L':
                val = 50;
                break;
            case 'C':
                val = 100;
                break;
            case 'D':
                val = 500;
                break;
            case 'M':
                val = 1000;
        }
        return val;
    }

    public static int romanToInt(String roman){
        char[] romanNumber = roman.toCharArray();
        int N = romanNumber.length;
        int sum = 0;
        for(int i=0; i<N; i++){
            char num = romanNumber[i];
            int numVal = RomanToInteger.symbolValue(num);
            if(i!=N-1) {
                char nextNum = romanNumber[i + 1];
                int nextNumVal = RomanToInteger.symbolValue(nextNum);
                if (numVal < nextNumVal) {
                    numVal *= -1;
                }
            }
            sum = sum + numVal;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a roman string : ");
        String str = scan.next();

        int value = RomanToInteger.romanToInt(str);
        System.out.println("Roman To int = " +value);
    }


}
