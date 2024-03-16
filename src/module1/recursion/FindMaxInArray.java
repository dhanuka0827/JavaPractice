package module1.recursion;

public class FindMaxInArray {
    public static void main(String[] args) {
        int [] arr = {22,33,4,139,7,56,8766};
        System.out.println(maxArray(arr, 0));

    }
    private static int maxArray(int[] arr, int i) {//4
        if(i==arr.length-1){
            return arr[i];
        }

        if(arr[i]> maxArray(arr, i+1)){//19>7
            return arr[i];
        }else
            return maxArray(arr, i+1);

    }
}
