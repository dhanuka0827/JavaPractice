package module1.java8;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {10, 3, 4, 6, 9, 1};
        System.out.println("Arrays before sorting : ");
        Arrays.stream(arr).forEach(num->System.out.print(num+" "));
        Sorting obj = new Sorting();
        //obj.bubbleSort(arr);
        obj.selectionSort(arr);


    }

    private void selectionSort(int[] arr) {
        
    }

    private void bubbleSort(int [] arr){
        int size = arr.length;

        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size -1 -i; j++){
                if((arr[j])>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nArrays after sorting : ");
        Arrays.stream(arr).forEach(num->System.out.print(num+" "));
    }
}
