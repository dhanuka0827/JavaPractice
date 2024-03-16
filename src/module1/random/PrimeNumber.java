package module1.random;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime = PrimeNumber.isPrime(num);

        System.out.println("IS the number prime ?"+isPrime);

    }

    private static boolean isPrime(int num) {

        for(int i =2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
