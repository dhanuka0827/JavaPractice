package module1.random;

//import net.logstash.logback.encoder.org.apache.commons.lang.StringUtils;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimePlay {

    public static void main(String[] args) throws ParseException {
        //getDerivedIntervalEpoch();
        //System.out.println(getQHTime("1698300896.857"));
        System.out.println(getEventTimeInEpoch("2023-11-06T12:42:06.369Z"));
    }

    private static String getEventTimeInEpoch(String eventTime) {
        ZonedDateTime zDateTime = ZonedDateTime.parse(eventTime);
        long timeStamp = zDateTime.toInstant().toEpochMilli();
        return String.format("%.3f", timeStamp / 1000d);
    }
}

/*        System.out.println(ZonedDateTime.now());
        System.out.println(getSQSEpocTime(ZonedDateTime.now()));

        //Double doubleTime = Double.parseDouble("1681736305.990");
        System.out.println(getQHTime("1681736305990"));
        System.out.println(getQHTime(System.currentTimeMillis()+""));
        System.out.println(getQHTime("1.68741270048E9"));
        //System.out.println(getQHTime(String.valueOf(doubleTime)));

        String currentTimestamp = "1681736226.607";
        double currentEventTime = Double.parseDouble(currentTimestamp);
        System.out.println(String.valueOf(currentEventTime));
        long epochTimefromdecimal = (long) (Double.parseDouble(currentTimestamp)*1000);
        System.out.println(String.valueOf(epochTimefromdecimal));
*/



    /*private static String getQHTime(String input) {
        Double timestamp = Double.parseDouble(input)*1000;
        ZonedDateTime dateTime = Instant.ofEpochMilli(timestamp.longValue())
                .atZone(ZoneId.of("GMT"));
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX"));
    }

    //consumer one
    private static void getDerivedIntervalEpoch() {
        double epochTime = 0;
        long currentTime = System.currentTimeMillis();
        ZonedDateTime dateTime = Instant.ofEpochMilli((long)System.currentTimeMillis())
                .atZone(ZoneId.of("UTC"));
        System.out.println("date time : "+dateTime);
        int endMin = dateTime.getMinute();
        int endHour = dateTime.getHour();
        String dmin = checkInterval(endMin);

        //endHour = dmin.equals("45") ? endHour - 1 : endHour;
        String formatted1 = dateTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy " + endHour + ":" + dmin + ":000"));
        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        try {
            df.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = df.parse(formatted1);
            long epochTimeLong = date.getTime() / 1000;
            epochTime = Double.parseDouble(epochTimeLong + ".000");
        } catch (Exception exception) {

        }
        System.out.println("Calculated epoch time to verify the next interval slot events received : " +
                String.format("%.3f", epochTime) +
                " for current time "+currentTime);
    }

    public static String checkInterval(int endMin) {
        String dmin;
        if (endMin < 15) {
            dmin = "00";
        } else if (endMin >= 15 && endMin < 30) {
            dmin = "15";
        } else if (endMin >= 30 && endMin < 45) {
            dmin = "30";
        } else {
            dmin = "45";
        }
        return dmin;
    }

    *//*private static double getDerivedIntervalEpoch(long eventTime) {
        long epochTime = 0;
        ZonedDateTime dateTime = Instant.ofEpochMilli((long) eventTime)
                .atZone(ZoneId.of("UTC"));
        int endMin = dateTime.getMinute();
        int endHour = dateTime.getHour();
        String dmin = endMin<15 ? "00" :
                ((endMin>=15 && endMin<30) ? "15" :
                        ((endMin>=30 && endMin<45) ? "30" : "45"));
        String formatted1 = dateTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy "+endHour+":"+dmin+":00"));

        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        try
        {
            df.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = df.parse(formatted1);
            long epochTimeLong = date.getTime()/1000;
            epochTime = (epochTimeLong);
        } catch (ParseException e1) {
        }
        return epochTime;
    }*//*
    *//*public static String getSQSEpocTime(ZonedDateTime dateTime) throws ParseException {

        String formattedStartTime = dateTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy " +
                String.format("%02d", dateTime.getHour()) + ":" + String.format("%02d", dateTime.getMinute()) + ":00"));

        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date batchStartDate = df.parse(formattedStartTime);
        long epocStartTime = batchStartDate.getTime() / 1000;
        String intervalStartTimeInEpoc = epocStartTime + ".000";
        ZonedDateTime batchEndTime = dateTime.plusMinutes(15).minusMinutes(1);
        String formattedEndTime = batchEndTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy " +
                String.format("%02d", batchEndTime.getHour()) + ":" +
                String.format("%02d", batchEndTime.getMinute()) + ":59"));
        Date batchEndDate = df.parse(formattedEndTime);
        long epocEndTime = batchEndDate.getTime() / 1000;
        String intervalSlotEndTimeInEpoc = epocEndTime + ".999";
        System.out.println("Calculated Batch Time for SQS with batch start: " + batchStartDate + " and batch end: " + batchEndDate +
                "with respective epocStartTime: " + epocStartTime + "and epocEndTime: " + epocEndTime);
        return intervalStartTimeInEpoc + "#" + intervalSlotEndTimeInEpoc;
    }
*//*

}
  *//*
    public static void main(String[] args) {

        //TimePlay.getQHTime(System.currentTimeMillis());
        *//**//*TimePlay.currentEventTime(System.currentTimeMillis());*//**//*

        //TimePlay.getQHTime();

     *//**//*   long currentTime = System.currentTimeMillis();
        currentTime = 1676637900;
        System.out.println(System.currentTimeMillis());
        //System.out.println(System.currentTimeMillis()/1000);

        long diffInMinutes = (currentTime - Long.parseLong("1676635200"))/60;
        System.out.println(diffInMinutes);*//**//*

        String epochTime = TimePlay.getEventTimeInEpoch("2023-02-16T16:02:15Z");
        System.out.println(epochTime);
        System.out.println(Double.parseDouble(epochTime));


        System.out.println(System.currentTimeMillis());
        System.out.println(TimePlay.getDerivedIntervalEpoch(Double.parseDouble(System.currentTimeMillis()/1000+""))-Double.parseDouble(epochTime));

    }

    private static String getEventTimeInEpoch(String eventTime) {
        ZonedDateTime zDateTime = ZonedDateTime.parse(eventTime);
        int nano = zDateTime.getNano();
        long timeStamp = zDateTime.toInstant().toEpochMilli();
        String epochTimestamp = (timeStamp / 1000) + "." +  String.format("%03d", (nano / 1000000));
        return epochTimestamp;
    }

    static void getQHTime(){
        long currentTime = Instant.now().toEpochMilli()/1000;
        System.out.println(currentTime);
        ZonedDateTime dateTime = Instant.ofEpochSecond(currentTime)
                .atZone(ZoneId.of("UTC"));
        ZonedDateTime dateTimeIndia = Instant.ofEpochSecond(currentTime)
                .atZone(TimeZone.getTimeZone("Asia/Kolkata").toZoneId());

        System.out.println(dateTime);
        System.out.println(dateTimeIndia);
        int endMin = dateTime.getMinute();
        int endHour = dateTime.getHour();
        String dmin = endMin<15 ? "00" :
                ((endMin>=15 && endMin<30) ? "15" :
                        ((endMin>=30 && endMin<45) ? "30" : "45"));

//		endHour = dmin.equals(ApplicationConstants.INTERVAL_45_MINS) ? endHour-1 : endHour;
        String qhTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'" + String.format("%02d", endHour) + ":" + dmin + ":" + "00.00X"));

        System.out.println(qhTime);

    }
    public static void getQHTime(double currentTimeNew){

        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf);
        String currentTime = time.format(dtf);
        System.out.println(currentTime);
        String[] splitedTime = currentTime.split(":");
        int min = Integer.parseInt(splitedTime[1]);
        String finalIntervalTime = null;
        String hour = splitedTime[0];
        System.out.println("hour: "+hour+", min: "+min);
        String updatedMin = null;
        if (min < 15 && min >= Integer.valueOf(0))
            updatedMin = "0";
        else if (min < 30 && min >= Integer.valueOf(15))
            updatedMin = "15";
        else if (min < 45 && min >= Integer.valueOf(30))
            updatedMin = "30";
        else if (min < 60 && min >= Integer.valueOf(45))
            updatedMin = "45";

        String str = "yyyy-MM-dd'T'" + String.format("%02d", hour) + ":" + updatedMin + ":" + "00.00X";

        finalIntervalTime =  time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'" + String.format("%02d", hour) + ":" + updatedMin + ":" + "00.00X"));


        System.out.println(finalIntervalTime);

    }

    public static void currentEventTime(double currentEventTime){
        ZonedDateTime dateTime = Instant.ofEpochSecond((long)(currentEventTime))
                .atZone(ZoneId.of("UTC"));
        System.out.println(dateTime);
        int endMin = dateTime.getMinute();
        int endHour = dateTime.getHour();
        String dmin = endMin<15 ? "00" :
                ((endMin>=15 && endMin<30) ? "15" :
                        ((endMin>=30 && endMin<45) ? "30" : "45"));

//		endHour = dmin.equals(ApplicationConstants.INTERVAL_45_MINS) ? endHour-1 : endHour;
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'" + String.format("%02d", endHour) + ":" + dmin + ":" + "00.00X")));
    }


    public static double getDerivedIntervalEpoch(double eventTime) {
        double epochTime = 0;
        ZonedDateTime dateTime = Instant.ofEpochSecond((long) eventTime)
                .atZone(ZoneId.of("UTC"));
        int endMin = dateTime.getMinute();
        int endHour = dateTime.getHour();
        String dmin = endMin<15 ? "00" :
                ((endMin>=15 && endMin<30) ? "15" :
                        ((endMin>=30 && endMin<45) ? "30" : "45"));

        String formatted1 = dateTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy "+endHour+":"+dmin+":00"));

        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        try
        {
            df.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = df.parse(formatted1);
            long epochTimeLong = date.getTime()/1000;
            epochTime = Double.parseDouble(epochTimeLong+".000");
        } catch (ParseException e1) {
        }
        return epochTime;
    }*//*

   *//* private static void getDerivedIntervalEpoch() {
        double epochTime = 0;
        ZonedDateTime dateTime = Instant.ofEpochMilli((long) System.currentTimeMillis())
                .atZone(ZoneId.of("GMT"));
        int endMin = dateTime.getMinute();
        int endHour = dateTime.getHour();
        String dmin = endMin < 15 ? "00"
                : ((endMin >= 15 && endMin < 30) ? "15"
                : ((endMin >= 30 && endMin < 45) ? "30" : "45"));
        endHour = dmin.equals("45") ? endHour - 1 : endHour;
        String formatted1 = dateTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy " +
                endHour + ":" + dmin + ":00"));
        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        try {
            df.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = df.parse(formatted1);
            long epochTimeLong = date.getTime() / 1000;
            epochTime = Double.parseDouble(epochTimeLong + ".000");
        } catch (Exception exception) {
            System.out.println(exception);
        }
        System.out.println("Time:"+String.format("%.3f",epochTime));

    }*//*

*/