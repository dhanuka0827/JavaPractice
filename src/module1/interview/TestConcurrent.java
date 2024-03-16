package module1.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestConcurrent {
    private void testConcurrent(List<Integer> list){
        /*for(Integer i: list){
            if(i.equals(5)){
                list.remove(i);
            }
        }*/

        /**
         * Will throwConcurrentModificationException
         */
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println(num);
            if(num.equals(5)){
                list.remove(num);
                //iterator.remove();
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(3);
        TestConcurrent tc = new TestConcurrent();
        tc.testConcurrent(list);


    }




}
