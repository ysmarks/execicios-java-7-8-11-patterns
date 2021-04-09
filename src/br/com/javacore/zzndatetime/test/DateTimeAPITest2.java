package br.com.javacore.zzndatetime.test;

import java.time.*;

public class DateTimeAPITest2 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());

        System.out.println("----------Duration------------");
        LocalTime time = LocalTime.of(12, 20, 30);
        LocalTime time1 = LocalTime.now();
        Duration duration = Duration.between(time1, time);
        System.out.println(duration.toHours());
        System.out.println(duration);
        System.out.println(duration.isZero());

        System.out.println("-----------Period-------------");

        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(2019, 11, 25);
        Period period = Period.between(date1, date);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getChronology());




    }
}
