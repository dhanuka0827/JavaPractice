package module1.random;

import java.util.Scanner;

public class FindPerfectNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        FindPerfectNumbers.printPerfectNumbers(num);
    }

    private static void printPerfectNumbers(int num) {

        System.out.println("Perfect Number between 1 and "+num+" are : ");
        for (int j = 1; j <= num; j++) {
            //System.out.println("value of j :"+j);
            int sumOfDivisors = 0;
            for (int i = 1; i <= j/2; i++) {
               // System.out.println("value of i :"+i);
                if (j % i == 0) {
                    sumOfDivisors += i;
                   // System.out.println("sumOfDivisors:"+sumOfDivisors);
                }
            }
            if(sumOfDivisors==j){
                System.out.println(j);
            }
           // System.out.println("");
        }
    }
}


