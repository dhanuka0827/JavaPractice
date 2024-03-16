package module1.recursion;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printDecreasing(sc.nextInt());
        sc.close();
    }

    private static void printDecreasing(int nextInt) {
        if(nextInt==0){
            return;
        }
        System.out.println(nextInt);
        printDecreasing(nextInt-1);
    }
}
