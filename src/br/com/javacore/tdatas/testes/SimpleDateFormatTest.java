package br.com.javacore.tdatas.testes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("'Mogi das Cruzes,' dd 'de' MMMM 'de' yyyy");
        System.out.println(sdf.format(c.getTime()));
    }
}
