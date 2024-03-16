package module1.java8;

import java.util.Arrays;

/**
 * program to find the
 * second-largest value in an array
 */
public class SecondLargestInArray {
    public static void main(String[] args) {
        // int[] sortedArray = {0,1,2,3,4,5,6,7,8,9};
        // System.out.println(findSecondLargest(sortedArray)); //8

        //int[] unsortedArray = {64, 543, 225, 75, 124, 871, 86, 123};
        int[] unsortedArray = {10,5,7,3,2,9};
        System.out.println(findSecondLargest(unsortedArray)); //543
    }

    private static int findSecondLargest(int[] newArray) {
      /*  final int[] largest = {Integer.MIN_VALUE};
        final int[] secondLargest = {Integer.MIN_VALUE - 1};
        Arrays.stream(newArray)
                .forEach(i -> {
                    if (i > largest[0]) {
                        secondLargest[0] = largest[0];
                        largest[0] = i;
                    }
                });
        return secondLargest[0];*/
        int maxNum = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i: newArray){
                if(i>maxNum){
                    secondLargest = maxNum;
                    maxNum = i;
                }else if(i>secondLargest){
                    secondLargest = i;
                }
            }
        return secondLargest;
        }
    }


