package br.com.javacore.zzndatetime.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class DateTimeAPITest6 {

    public static void main(String[] args) {
        for(Map.Entry<String, String> zona : ZoneId.SHORT_IDS.entrySet()) {
            System.out.println(zona.getKey() + " " + zona.getValue());
        }
        System.out.println("-----------------------------");
        System.out.println(ZoneId.systemDefault());

        System.out.println("-----------------------------");
        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneTokyo);
        System.out.println(zonedDateTime);

        System.out.println("--------------------------");
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime1 = instant.atZone(zoneTokyo);
        System.out.println(zonedDateTime1);

        System.out.println("-------------");
        ZoneOffset zoneOffsetMax = ZoneOffset.MAX;
        ZoneOffset zoneOffsetMin = ZoneOffset.MIN;
        System.out.println(zoneOffsetMax);
        System.out.println(zoneOffsetMin);
        JapaneseDate date = JapaneseDate.now();
        System.out.println(date);
    }
}
