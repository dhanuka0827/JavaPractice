package module1.java8;

import java.util.Arrays;

public class FindOccurence {
    public static void main(String[] args) {
        int[] sortedArray  = {1,1,2,2,2,2,2,3,4,4,4,5,5,6,6,7,9};
        System.out.println(findOccurenceOf(sortedArray, 2));

        int[] unsortedArray = {64,2,5,7,2,6,8,3,78,3,3,2,6,7,2,2,2,68,2};
        System.out.println(findOccurenceOf(unsortedArray, 2));
    }

    private static long findOccurenceOf(int[] passedArray, int i) {
        return Arrays.stream(passedArray).filter(j->j==i).count();
    }
}
