package module1.random;

import java.util.ArrayDeque;
import java.util.Comparator;

public class TestArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Comparator<Integer> intComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(5);
        /*System.out.println(deque.toArray());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());*/
        System.out.println(deque.stream().max(intComparator).get());
    }
}
