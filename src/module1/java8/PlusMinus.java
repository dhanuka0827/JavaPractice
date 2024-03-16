package module1.java8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PlusMinus {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int[] pos = new int[1];
        int[] neg = new int[1];
        int[] zero = new int[1];
        arr.stream()
                .forEach(i -> {
                    if(i>0){
                        pos[0]++;
                    } else if (i<0) {
                        neg[0]++;
                    }else
                        zero[0]++;
                });
        double frac = (double) pos[0]/arr.size();
        System.out.println(String.format("%.6f", frac));
        frac = (double) neg[0]/arr.size();
        System.out.println(String.format("%.6f", frac));
        frac = (double) zero[0]/arr.size();
        System.out.println(String.format("%.6f", frac));

        //itrate through the array
        // have 3 variable
        //update respective variable


    }

    public static void main(String[] args) throws IOException {
      /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
*/
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 7, -6, 3, 0));

        plusMinus(arr);

        //bufferedReader.close();
    }
}

