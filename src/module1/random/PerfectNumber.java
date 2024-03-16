package module1.random;

import java.util.Scanner;

public class PerfectNumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Number is a perfect Number : "+PerfectNumber.isPerfect(num));
    }

    private static boolean isPerfect(int num) {
        int sumOfDivisors = 0;
        for(int i =1; i<=num/2; i++){

            if(num%i==0){
                sumOfDivisors+=i;
            }
        }
        return sumOfDivisors==num;
    }
}
