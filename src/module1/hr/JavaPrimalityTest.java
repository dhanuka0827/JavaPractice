package module1.hr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        isPrimeNumber(n);
        bufferedReader.close();
    }

    private static void isPrimeNumber(String num) {
        BigInteger bi = new BigInteger(num);
        boolean isPrime = bi.isProbablePrime(1);
        System.out.println(isPrime);
        System.out.println(isPrime?"prime":"not prime");
    }
}
