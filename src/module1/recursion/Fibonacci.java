package module1.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num;i++)
            System.out.println(printFibonacciUsingRecursion(i));
    }

    private static int printFibonacciUsingRecursion(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return printFibonacciUsingRecursion(n-1)+printFibonacciUsingRecursion(n-2);
    }
}
