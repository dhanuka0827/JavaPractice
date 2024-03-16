package module1.random;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GetTimeMidnight {

    public static void main(String[] args) {
        /*LocalTime midnight = LocalTime.MIDNIGHT;

        LocalDate today = LocalDate.now(ZoneId.of("Europe/Berlin"));
        LocalDateTime todayMidnight = LocalDateTime.of(today, midnight);
        //LocalDateTime tomorrowMidnight = todayMidnight.plusDays(1);

        System.out.println(new Date());
        System.out.println(midnight);
        System.out.println(today);
        System.out.println(todayMidnight);
        //System.out.println(tomorrowMidnight);*/

      /*  Long time = new Date().getTime();
        Date date = new Date(time - time % (24 * 60 * 60 * 1000));
        System.out.println(time);
        System.out.println(date);*/

       // Date currentDate = new Date();
        /*System.out.println(currentDate);
        Calendar calendar = new GregorianCalendar();
        calendar.set(currentDate.getYear(), currentDate.getMonth(), currentDate.getDate(), 0, 0, 0);
        currentDate= calendar.getTime();
        System.out.println(currentDate);*/
      /*  org.joda.time.DateTime now = new DateTime();
        currentDate = now.withTimeAtStartOfDay().toDate();*/

        /*Date date = new Date();
        System.out.println(date);
        Instant inst = date.toInstant();
        System.out.println(inst);
        LocalDate localDate = inst.atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);
        Instant dayInst = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
        System.out.println(dayInst);
        Date day = Date.from(dayInst);
        System.out.println(day);*/

       /* Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar);
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -60);
        System.out.println(calendar.getTime());*/

        int minutesToMinus = 120;
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -minutesToMinus);
        System.out.println(calendar.getTime());

        String s=new SimpleDateFormat("dd-MM-yyyy:HH:mm:ss.sss").format(date);
        //Date date1 = new SimpleDateFormat("dd-MM-yyyy:HH:mm:ss.sss");
        System.out.println(s);
    }
}
