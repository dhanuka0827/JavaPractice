package module1.leetcode.hard;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class FirstMissingPositive {
    public static void main(String[] args) {

        //int[] nums = {1,2,0};
        //int[] nums = {3,4,-1,1};
        //int[] nums = {7,8,9,11,12};
        int[] nums = {0,2,2,1,1};
        System.out.println(firstMissingPositive(nums));
    }
    private static int firstMissingPositive(int[] nums) {
        nums = Arrays.stream(nums).sorted().distinct().toArray();
        System.out.println(Arrays.toString(nums));
        int count = 1;
        for(int i : nums){
            if(i>0){
                if(i!=count){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}
