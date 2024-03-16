package dsa.kk;

import dsa.kk.pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class WildCardUtil {

    public static void main(String[] args) throws InterruptedException {
        List<?> list = new ArrayList<>();
        helperMethod(list, "randomString");
        System.out.println(list.get(0));
    }

    private static void helperMethod(List<?> list, String randomString) {
        List<Object> newList = (List<Object>) list;
        newList.add(randomString);
    }

}
