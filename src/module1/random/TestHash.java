package module1.random;

import java.util.HashMap;
import java.util.HashSet;

public class TestHash {

    public static void main(String[] args) {
        testHashMap(300);

    }

    private static void testHashMap(int key) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(100, 1);
        map.put(200, 1);
        map.put(300, 4);
        map.put(400, 1);
        System.out.println(map.get(key));
        if(map.containsKey(key)){
            int value = map.get(key);
            //value++;
            if(value==4){
                System.out.println("External");
                map.remove(key);
            }else{
                map.put(key, ++value);
            }
        }
        else{
            map.put(key, 5);
        }
        System.out.println(map.get(key));

    }

    private static void testHashSet() {

        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("hi");
        set.add("");
        set.add("hello");
        set.add(null);
        set.add(null);
        set.add("");

        set.forEach(s -> System.out.println(s));
        System.out.println(set.size());
    }
}
