package module1.random;

import java.util.Scanner;

public class ArmstrongNumber {

    private static boolean isArmstrong(int num){
        int sum=0;
        int checkArmstrong = num;

        int count = ArmstrongNumber.findNumberofDigits(num);
        //System.out.println("Digits : "+count);
        while(checkArmstrong!=0){
            //System.out.println("The number : "+checkArmstrong);
            int remainder = checkArmstrong%10;
            //System.out.println("remainder: "+remainder);
            sum += Math.pow(remainder,count);
            //System.out.println("Sum of Cube of remainder: "+sum);
            checkArmstrong/=10;
            //System.out.println("");
        }
        return sum==num;
    }
    private static int findNumberofDigits(int num) {
        int count = 0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Is the number an Armstrong Number ? "+ArmstrongNumber.isArmstrong(num));
    }
}
