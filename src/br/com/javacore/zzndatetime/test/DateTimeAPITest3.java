package br.com.javacore.zzndatetime.test;

import java.time.LocalDate;

public class DateTimeAPITest3 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        date = date.withYear(2012);
        System.out.println(date);
        date = date.plusYears(7);
        System.out.println(date);
    }
}
