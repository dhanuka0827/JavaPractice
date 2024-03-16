package module1.random;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("isPalindrome: " +Palindrome.isPalindrome(num));
    }

    private static int findReverse(int num){
        int reverse=0;
        int remainder;
        while(num!=0) {
            remainder = num % 10;
            reverse = reverse*10 + remainder;
            num/=10;
        }
        return reverse;
    }
    private static boolean isPalindrome(int num) {
        int reverseNum = Palindrome.findReverse(num);
        //System.out.println("Number : "+num+", Reverse Number : "+reverseNum) ;
        if(num==reverseNum)
            return true;
        else
            return false;
    }
}
