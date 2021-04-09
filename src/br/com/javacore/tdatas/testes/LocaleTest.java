package br.com.javacore.tdatas.testes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

    public static void main(String[] args) {

        Locale locItalia = new Locale("it", "IT");
        Locale locSuica = new Locale("it", "CH");
        Locale locIndia = new Locale("hi", "IN");
        Locale locJapao = new Locale("ja");

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.AUGUST, 04);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalia);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);

        System.out.println(df.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(df4.format(calendar.getTime()));
        System.out.println("---------------------");
        System.out.println(locIndia.getDisplayCountry(locIndia));

    }
}
