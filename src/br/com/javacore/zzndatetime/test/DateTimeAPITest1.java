package br.com.javacore.zzndatetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeAPITest1 {

    public static void main(String[] args) {

        //LocalDate exemple
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("Dia do ano: " + localDate.getDayOfYear());
        System.out.println(localDate.getEra());
        System.out.println(localDate.getMonthValue());

        System.out.println("--------------------------");
        //LocalTime exemple
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getNano());
        System.out.println(localTime.atDate(localDate));

        System.out.println("--------------------------");
        //LocalDateTime exemple
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
