package module1.random;

import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Prime Number between 1 and " + num + " are :");
        FindPrimeNumbers.findPrimeNumbers(num);
        //  System.out.println("IS the number prime ?" + isPrime);
    }

    private static void findPrimeNumbers(int num) {
        //System.out.println(1);

        for (int j = 1; j <= num; j++) {
            System.out.println("j :"+j);
            int count = 0;
            for (int i = 1; i <= j / 2; i++) {
                System.out.println("i :"+i);
                if(j==2)
                    break;
                if (j % i == 0) {
                    count++;
                    System.out.println("Count:"+count);
                }
            }
            if(count>1){
                System.out.println("prime number : "+j);
            }
        }
    }
}
