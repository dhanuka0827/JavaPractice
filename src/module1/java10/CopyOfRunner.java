package module1.java10;

import java.util.ArrayList;
import java.util.List;

public class CopyOfRunner {
    public static void main(String[] args) {
        List list = List.of("Neha","Sneha","Vinitha");
        //list.add("Ritu"); // Should throw error
        System.out.println(list);

        List<String> anotherList = new ArrayList<>();
        anotherList.add("Pari");
        anotherList.add("Neetu");
        anotherList.add("Deepa");
        anotherList.add("Vedansh");

        List<String> newList = List.copyOf(anotherList);
        anotherList.add("Extra");
        //newList.add("Extra1"); //Error
        System.out.println(newList);
        System.out.println(anotherList);


    }
}
