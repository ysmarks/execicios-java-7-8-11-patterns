package br.com.javacore.tdatas.testes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) throws InterruptedException {

        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = Date.from(Instant.from(localDateTime.atZone(ZoneId.systemDefault())));
        //System.out.println(date);

        Date date1 = new Date();
        LocalDateTime localDateTime1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        //System.out.println(localDateTime1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("FORMATADO " + localDateTime1.format(dateTimeFormatter));
        //String format = localDateTime1.format(dateTimeFormatter);


        //define datas
        LocalDateTime dataCadastro = LocalDateTime.of(2020, 10, 29, 22, 40, 0);
        LocalDateTime hoje = LocalDateTime.now();

        //calcula diferença
        Long minutos = dataCadastro.until(hoje, ChronoUnit.MINUTES);
        System.out.println(dataCadastro);
        System.out.println(hoje);
        System.out.println(minutos);

            if (minutos > 9) {
                System.out.println("Ta funcionando");
            }

    }
}
