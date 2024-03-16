package module1.random;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DeepCopyQueue {

    public static void main(String[] args) {
        /*ConcurrentLinkedQueue<Student> queue = new ConcurrentLinkedQueue();
        queue.add(new Student("hi"));
        queue.add(new Student("bi"));
        queue.add(new Student("di"));
        queue.add(new Student("ci"));
        queue.add(new Student("si"));

        ConcurrentLinkedQueue<Student> copyQueue = new ConcurrentLinkedQueue<>(queue);
        System.out.println(copyQueue.poll());
        System.out.println(copyQueue.poll());
        System.out.println(queue);
        System.out.println(copyQueue);*/

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Hi"));
        studentList.add(new Student("Hello"));
        studentList.add(new Student("Hey"));
        System.out.println(studentList);
        System.out.println(studentList.toArray());
        System.out.println(System.currentTimeMillis());

    }
}
