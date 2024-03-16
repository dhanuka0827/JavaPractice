package module1.recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printIncreasing(sc.nextInt());
        sc.close();
    }

    private static void printIncreasing(int nextInt) {
        if(nextInt==0){
            return;
        }
        printIncreasing(nextInt-1);
        System.out.println(nextInt);

    }
}
