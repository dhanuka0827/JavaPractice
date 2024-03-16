package module1.java8;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(10);
        integerList2.add(20);
        integerList2.add(30);
        integerList2.add(40);
        integerList2.add(50);
        integerList2.add(60);
        integerList.addAll(integerList2);
        System.out.println("Merged:"+integerList);

        Collections.sort(integerList);
        System.out.println("Sorted:"+integerList);
       // Set<Integer> set = new HashSet<>(integerList);
        SortedSet<Integer> set = new TreeSet<>(integerList);
        List<Integer> list = new ArrayList<>(set);
        System.out.println("Without duplicates:"+list);

    }

    private static void checkParellelList(List<Integer> integerList) {
        //integerList.parallelStream().filter(i->i%2==0).forEach(System.out::println);
        integerList.stream().filter(i->i%2==0).forEach(System.out::println);

        List<String> stringList = new ArrayList<>();
        stringList.add("neha");
        //stringList.stream().allMatch();
    }
}
