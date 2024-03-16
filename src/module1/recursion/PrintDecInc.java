package module1.recursion;

import java.util.Scanner;

public class PrintDecInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printDecInc(sc.nextInt());

    }

    private static void printDecInc(int nextInt) {
        if(nextInt==0){
            return;
        }
        System.out.println(nextInt);
        printDecInc(nextInt-1);
        System.out.println(nextInt);
    }
}
