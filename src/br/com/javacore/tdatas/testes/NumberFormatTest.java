package br.com.javacore.tdatas.testes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {
        float valor = 123.45678f;
        Locale locale = new Locale("fr");
        NumberFormat[] formats = new NumberFormat[4];
        formats[0] = NumberFormat.getInstance();
        formats[1] = NumberFormat.getInstance(locale);
        formats[2] = NumberFormat.getCurrencyInstance();
        formats[3] = NumberFormat.getCurrencyInstance(locale);

        for (NumberFormat nf : formats) {
            System.out.println(nf.format(valor));
        }

        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(valor));
        String parseValor = "123.45678f";

        try {
            System.out.println(nf.parse(parseValor));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
