package module1.recursion;

public class LastOccurence {
    public static void main(String[] args) {
        int [] arr = {1,3,3,5,6,4,5,9,3,1,7,5,4,2,4};
        int data = 1;
        System.out.println(lastOccurence(arr, 0, data));
    }

    private static int lastOccurence(int[] arr, int i, int data) {
        if(i==arr.length){
            return -1;
        }

        if((arr[arr.length-i-1])==data){
            return arr.length-i-1;
        }else{
            return lastOccurence(arr, i+1, data);
        }
    }
}
