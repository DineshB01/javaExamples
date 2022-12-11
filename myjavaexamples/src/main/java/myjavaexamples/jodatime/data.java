package myjavaexamples.jodatime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

public class data {
    public static void main(String[] args){
//localdate class
        LocalDate today=LocalDate.now();
        LocalDate date=LocalDate.of(1999,10,12);
        int year= date.getYear();
        Month month=date.getMonth();
        int monthinumeric=date.get(ChronoField.MONTH_OF_YEAR);
        int day=date.getDayOfMonth();
        DayOfWeek dow=date.getDayOfWeek();
        int len=date.lengthOfMonth();
        boolean leap=date.isLeapYear();

        //parsenlocaldate
        LocalDate parseDate=LocalDate.parse("1999-12-10");
//localtime
        LocalTime timenow=LocalTime.now();
        LocalTime time=LocalTime.of(12,20,10);
        int hour=time.getHour();
        int min=time.getMinute();
        int sec=time.getSecond();
        //parsetime
        LocalTime parseTime=LocalTime.parse("13:30:30");
//Localdateandtime
        //by passing time and date object
        LocalDateTime ldt=LocalDateTime.of(today,timenow);
        LocalDateTime now=LocalDateTime.now();
        LocalDateTime datetime=LocalDateTime.of(1999,10,12,12,30);
        //plus any variable
        datetime.plusDays(1);
        //minue any variables
        datetime.minusMonths(1);
//Instant,duration,period
        Instant instant=Instant.ofEpochSecond(6);//here 6 second added to base date 1970 jan 1//nanoadjustment .ofEpochSecond(4,1_000)
        Instant instantnow=Instant.now();
        //duration between instant
        Duration instantDuration=Duration.between(instant,instantnow);
        //duration between localdate
        Period dateduration=Period.between(today,parseDate);
        //duration between localtime
        Duration localtime=Duration.between(timenow,timenow);
//timezones
        //Classes ZoneId,ZoneOffset,ZoneDateTime,OffsetDateTime
        ZoneId india=ZoneId.of("Asia/Kolkata");
        ZonedDateTime indiatime=ZonedDateTime.now(india);//ZonedDateTime indiatime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Time in india"+indiatime);
        //for below the time of paris is calculated from indias time or we can do the above too based on need
        ZonedDateTime parisZoneDateTime=indiatime.withZoneSameInstant(ZoneId.of("Europe/paris"));
        //ZoneOffset creating india time using offset from utc
        ZoneOffset zoneOffset=ZoneOffset.of("+05:30");
        OffsetDateTime offsetDateTime=OffsetDateTime.now(zoneOffset);
        OffsetDateTime offsetDateTime1=OffsetDateTime.now(ZoneOffset.of("-05:30"));//alternative for above
        //adding values to zonedatetome,offsetdatetime
        indiatime.plusDays(1);
        offsetDateTime1.plusDays(1);//to add days etc..
        //

        System.out.println(indiatime.toEpochSecond()-offsetDateTime1.toEpochSecond());

        //formatter
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatted=datetime.format(formatter);

    }
}
