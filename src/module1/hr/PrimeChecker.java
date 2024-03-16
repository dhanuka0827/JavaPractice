package module1.hr;

import java.util.Scanner;

public class PrimeChecker {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        for(int i = 1 ; i <= 5; i++){
            int number = sc.nextInt();
            if(Prime.checkPrime(number)){
                s+= number + " ";
            }
            if(i == 4)continue;
            System.out.println(s);
        }

    }
}

class Prime{
    public static boolean checkPrime (int number){
        if(number == 1) return false;
        if(number == 2 || number == 3) return true;
        for (int i = 2; i <= number / 2; i++)
            if(number % i == 0) return false;
        return true;
    }
}
