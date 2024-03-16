package module1.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 3, 4, 6, 9, 1};
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size -i- 1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
