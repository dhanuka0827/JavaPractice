package module1.leetcode.easy;

public class RemoveElements {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i <=nums.length-1;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;

    }
}
