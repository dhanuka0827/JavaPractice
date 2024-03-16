package module1.random;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class TestRandom {

    public static void main(String[] args) {
      boolean x = true;
      List<String> list = new ArrayList<>();
      list.add("a");
      list.add("b");
      list.add("c");

        if(x){
            for(String s : list){
                System.out.println("inside for with s = "+s);
                if(s=="b"){
                    System.out.println("s is b");
                }
                break;
                //System.out.println("24 s: "+s);
            }
            System.out.println("At line 26");
        }
        System.out.println("out of outer if");

    }
}
