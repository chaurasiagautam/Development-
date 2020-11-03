package main.java.practice;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;
import static jdk.nashorn.internal.parser.DateParser.DAY;

public class Comparision {

    public static void main(String[] args) throws ParseException {
        boolean t = true;
        boolean y = true;
        boolean tr = t || y;
/*        Date dt = new Date();
        Instant end = Instant.now().plus(Duration.ofMinutes(65));
        Instant str = dt.toInstant();

        System.out.println(end);
        System.out.println(str);
        System.out.println(Duration.between(str,end).toHours());
        System.out.println(Duration.between(str,end).toMinutes());
        System.out.println(Duration.between(str,end).toMillis());*/
        getDiff();

    }

    public void testTime(){
        String startDate = "11/03/14 09:29:58";
        String stopDate = "11/03/14 09:33:43";

// Custom date format
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(startDate);
            d2 = format.parse(stopDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

// Get msec from each, and subtract.
        long diff = d2.getTime() - d1.getTime();
        long diffSeconds = diff / 1000;
        long diffMinutes = diff / (60 * 1000);
        long diffHours = diff / (60 * 60 * 1000);
        System.out.println("Time in seconds: " + diffSeconds + " seconds.");
        System.out.println("Time in minutes: " + diffMinutes + " minutes.");
        System.out.println("Time in hours: " + diffHours + " hours.");
    }

    private static void getDiff() throws ParseException {
        Date dt = new Date();
        System.out.println(dt);
        String dateStart = "05/13/2020 09:15:00";
        String dateStop = "05/21/2020 16:57:58";
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        SimpleDateFormat format1 = new SimpleDateFormat("HH:mm:ss.S");

        Date d1 = null;
        Date d2 = null;
        Date d3 = null;

            d1 = format.parse(dateStart);
//            d2 = format.parse(dateStop);
            d3 = format.parse(dateStop);

            //in milliseconds
//            long diff = d2.getTime() - d1.getTime();
//        System.out.println(diff);
//        System.out.println(new Date(diff));

/*            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            System.out.print(diffDays + " days, ");
            System.out.print(diffHours + " hours, ");
            System.out.print(diffMinutes + " minutes, ");
            System.out.print(diffSeconds + " seconds.");*/
            LocalDateTime st = LocalDateTime.ofInstant(d1.toInstant(),ZoneId.systemDefault());
            LocalDateTime ed = LocalDateTime.now();
            Duration duration = Duration.between(st, ed);
            System.out.println(st);
            System.out.println(ed);
        // days between from and to
        System.out.println(duration.toDays() + " days");

        // hours between from and to
        System.out.println(duration.toHours() + " hours");

        // minutes between from and to
        System.out.println(duration.toMinutes() + " minutes");

        // seconds between from and to
//        System.out.println(duration.toSeconds() + " seconds");
        System.out.println(duration.getSeconds() + " seconds");

        long days = st.until(ed, ChronoUnit.DAYS);
        st = st.plusDays(days);

        long hours = st.until(ed, ChronoUnit.HOURS);
        st = st.plusHours(hours);

        long minutes = st.until(ed, ChronoUnit.MINUTES);
        st = st.plusMinutes(minutes);

        long seconds = st.until(ed, ChronoUnit.SECONDS);
        st = st.plusSeconds(seconds);

        long millis = st.until(ed, ChronoUnit.MILLIS);

        System.out.println("From = " + st);
        System.out.println("ed   = " + ed);
        System.out.printf("The difference is %s days, " +
                        "%s hours, %s minutes, %s seconds, %s millis",
                 days, hours, minutes, seconds, millis);
        System.out.println();
/*        LocalDateTime res = LocalDateTime.of(d1.getYear(),d1.getMonth(),(int)days,(int)hours,(int)minutes,(int)seconds,(int)millis);
*//*        res.plusDays(days);
        res.plusHours(hours);
        res.plusMinutes(minutes);
        res.plusSeconds(seconds);*//*
        System.out.println(res);*/
        System.out.println(String.format("%s %s:%s:%s.%s",LocalDate.now().toString(),hours,minutes,seconds,millis));

        //

        d2 = format1.parse(String.format("%s:%s:%s.%s",hours,minutes,seconds,millis));
        System.out.println(d2);

        LocalTime time = st.toLocalTime();
        LocalTime end = LocalTime.now();
        long hour = time.until(end, ChronoUnit.HOURS);
        long min = time.until(end, ChronoUnit.MINUTES);
        long sec = time.until(end, ChronoUnit.SECONDS);
        long mil = time.until(end, ChronoUnit.MILLIS);
        LocalTime res = LocalTime.of((int)hour,(int)min,(int)sec,(int)mil);
        System.out.println(res);

        Time time1 = new Time((int)hours,(int)minutes,(int)seconds);
        System.out.println(time1);

        long tim = System.currentTimeMillis() - d3.getTime();
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(tim);
        System.out.println("tim---- " +tim);
        System.out.println(cal.toString());


        }



}
