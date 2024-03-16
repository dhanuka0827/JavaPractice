package module1.random;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DayOfMonth {

    private void printDayOfMonth(){
        String date = "2022-10-28T10:47:33.000Z";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        LocalDate localDate = LocalDate.parse(date, df);
        System.out.println("Day of Month :"+ localDate.getDayOfMonth());
    }

    private void printDayOfMonthV2() throws ParseException {
        String date = "2022-10-28T10:47:33.000Z";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        Date formattedDate = format.parse(date);
        System.out.println(formattedDate.getDate());
    }

    public static void main(String[] args) throws ParseException{
        DayOfMonth obj = new DayOfMonth();
        obj.printDayOfMonth();
        obj.printDayOfMonthV2();
    }
}
