package module1.random;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 3, 11, 9, 1};
        int size = arr.length;
        for(int i = 0; i<size-1; i++){
            int smallest=i;
            for(int j = i+1; j<size;j++){
                if(arr[smallest]>arr[j])
                {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
