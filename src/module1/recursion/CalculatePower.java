package module1.recursion;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
       // System.out.println("Power: "+ calcPower(x, n));
        System.out.println("Power: "+ calcPower2(x, n));
    }

    private static int calcPower2(int x, int n) {
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return calcPower2(x,n/2)*calcPower(x,n/2);
        }else{
            return calcPower2(x,n/2)*calcPower(x,n/2)*x;
        }
    }

    private static int calcPower(int x, int n) {
        if(n ==0){
            return 1;
        }
        return (x * calcPower(x, n-1));
    }


}
