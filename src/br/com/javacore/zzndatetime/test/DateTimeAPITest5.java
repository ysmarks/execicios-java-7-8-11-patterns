package br.com.javacore.zzndatetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPITest5 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        String format = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format1 = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);
        System.out.println(format1);

        String parse = "20200908";
        LocalDate parse1 = LocalDate.parse(parse, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        LocalDateTime dateTime = LocalDateTime.now();
        String format2 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("format2: " + format2);
        String parse2 = "2020-09-08T11:45:57.94";
        LocalDateTime parse3 = LocalDateTime.parse(parse2);
        System.out.println(parse3);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format3 = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println(format3);

        String parse4 = "08/09/2020";
        LocalDate parse5 = LocalDate.parse(parse4, dateTimeFormatter);
        System.out.println(parse5);
    }
}
