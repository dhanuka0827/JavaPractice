package module1.random;

import java.util.Scanner;

public class Fibonacci {
    //static int N = 20;

    public static void printFibonacci(int N) {
        int a = 0;
        int b = 1;
        System.out.print(a +", ");
        for (int j = 1; j <= N-1; j++) {
            if(j<N-1)
                System.out.print(b +", ");
            else
                System.out.print(b +" - Fibonacci upto "+N+" terms");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of terms to print : ");
        int limit = sc.nextInt();
        Fibonacci.printFibonacci(limit);
    }
}
