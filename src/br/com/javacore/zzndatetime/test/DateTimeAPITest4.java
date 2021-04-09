package br.com.javacore.zzndatetime.test;

import br.com.javacore.zzndatetime.util.ObterProximoDiaUtil;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPITest4 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        /*System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = localDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());*/
        //localDate = localDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(localDate);

        localDate = localDate.with(new ObterProximoDiaUtil());
        System.out.println(localDate);

        localDate = localDate.plusDays(2);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = localDate.with(new ObterProximoDiaUtil());
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

    }
}
