package module1.random;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Hello {

    private Boolean bool = Boolean.FALSE;
    public static void main(String[] args) throws InterruptedException {
        System.out.println(anotherMethod("hi"));
        System.out.println(anotherMethod("hi2"));
        System.out.println(anotherMethod("hi3"));
        System.out.println(anotherMethod("hi4"));
        System.out.println(anotherMethod("hi5"));
        System.out.println(anotherMethod("herg"));
    }

    private static boolean anotherMethod(String str){

        switch (str){
            case "hi":
            case "hi2":
            case "hi3":
            case "hi4":
            case "hi5":
                return true;
            default:
                return false;
        }

    }
    private void getCurrentEpochTime(){
        long currentEpochTime = System.currentTimeMillis();
        System.out.println(currentEpochTime);
        System.out.println(Thread.currentThread());
        System.out.println("bool:"+bool);
    }

    private static void getSQSBatches(List<String> messageList, int start) {
        int listSize = messageList.size();
        int index = 0;
        int counter = start;
        List<String> entries = new ArrayList<>();
        while (index <= 10 - 1 && counter < listSize) {
            entries.add(messageList.get(counter)+", ");
            counter++;
            index++;
        }
        System.out.println(entries);
    }
}
