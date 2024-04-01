package module1.leetcode.SlidingWindow;

import java.util.HashSet;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        /*int[] num = {1,5,4,2,9,9,9};
        int k = 3;*/
        int[] num = {1,2,2};
        int k = 2;
        /*int[] num = {4,4,4};
        int k = 3;*/
        System.out.println(maximumSubarraySum(num, k));
    }

    public static long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long maxSum = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        while(j<nums.length){
            if(set.contains(nums[j])) {
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);
            sum += nums[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                maxSum = Math.max(maxSum, sum);
                sum -=nums[i];
                i++;
                j++;
                set.remove(nums[i]);
            }
        }
        return maxSum;
    }
}
