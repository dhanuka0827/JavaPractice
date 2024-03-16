package module1.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortWithJ8 {
    public static void main(String[] args) {
        int [] array = {32,4,3,26,23,23,45,98,1};
        System.out.println("Descending Order: "+sortArrayDescending(array));

        System.out.println("Ascending Order: " +sortArrayAscending(array));
    }

    private static List<Integer> sortArrayAscending(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<Integer> sortArrayDescending(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .sorted((a,b)->(b-a))
                .collect(Collectors.toList());
    }
}
