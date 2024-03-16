package module1.recursion;

public class DisplayArray {

    public static void main(String[] args) {
        int[] arr = {10, 20 , 30, 40, 50};
        int index = 4;
        displayArrayAscd(arr, index);
        System.out.println();
        displayArrayDesc(arr, index);
    }

    private static void displayArrayAscd(int[] arr, int index) {
        if(index<0){
            return;
        }
        displayArrayAscd(arr, index-1);
        System.out.println(arr[index]);
    }

    private static void displayArrayDesc(int[] arr, int index) {
        if(index<0){
            return;
        }
        System.out.println(arr[index]);
        displayArrayDesc(arr, index-1);

    }
}
