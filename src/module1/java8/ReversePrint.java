package module1.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Reverse an array using java 8
 */
public class ReversePrint {
    public static void main(String[] args) {
        int[] sortedArray = {0,1,2,3,4,5,6,7,8,9};
        //System.out.println(reversePrint(sortedArray));
        //reversePrint(sortedArray);
        System.out.println("");
        int[] unsortedArray = {64,543,225,75,124,871,86,123};
        //System.out.println(reversePrint(unsortedArray));
        reversePrint(unsortedArray);
    }

    private static void reversePrint(int[] newArray) {
        /*int[] reversed = IntStream.rangeClosed(1, newArray.length)
                .map(i -> newArray[newArray.length - i])
                .toArray();
        System.out.println(Arrays.toString(reversed));*/

        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        int[] reversed = IntStream.rangeClosed(1, newArray.length)
                .map(i -> newArray[newArray.length - i])
                .toArray();
        System.out.println(Arrays.toString(reversed));

    }
}
