package br.com.javacore.zzoagendador.testes;

import java.util.Collections;

public class CoverterDecimalParaRomanoTest {
    private static final int[] DECIMAIS =
            {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMANOS =
            {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static void main(String[] args) {

        System.out.println(teste(20));

    }

    public static String teste(int number) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < DECIMAIS.length; i ++) {
            int inteiro = DECIMAIS[i];
            while (number >= inteiro) {
                number -= inteiro;
                result.append(ROMANOS[i]);
            }
        }
        return result.toString();
    }
}
