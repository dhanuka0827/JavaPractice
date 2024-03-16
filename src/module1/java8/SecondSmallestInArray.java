package module1.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondSmallestInArray {

    public static void main(String[] args) {
        int[] sortedArray = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(findSecondSmallest(sortedArray)); //1

        int[] unsortedArray = {64,543,225,75,124,871,86,123};
        System.out.println(findSecondSmallest(unsortedArray)); //75
    }

    private static int findSecondSmallest(int[] newArray) {

        return Arrays.stream(newArray)
                .distinct()
                .boxed()
                .sorted()
                .collect(Collectors.toList())
                .get(1);
    }
}
