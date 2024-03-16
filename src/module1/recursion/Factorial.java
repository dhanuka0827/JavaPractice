package module1.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(printFactorial(sc.nextInt()));
    }

    private static int printFactorial(int n) {
        if(n==1){
            return 1;
        }
        return n * printFactorial(n-1);
    }
}
