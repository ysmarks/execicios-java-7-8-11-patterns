package br.com.javacore.tdatas.testes;

import java.util.Calendar;

public class ManipulacaoDedatasTest {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        calendar.add(Calendar.HOUR, 2);
        System.out.println(calendar.getTime());

    }
}
