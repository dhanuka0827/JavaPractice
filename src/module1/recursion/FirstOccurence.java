package module1.recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int [] arr = {1,3,3,5,6,4,5,9,3,1,7,5,4,2,4};
        int data = 99;
        System.out.println(firstOccurence(arr, 0, data));

    }

    private static int firstOccurence(int[] arr, int i, int data) {//0,4
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==data){
            return i;
        }else{
            return firstOccurence(arr, i+1, data);//1,4
        }
    }

}
