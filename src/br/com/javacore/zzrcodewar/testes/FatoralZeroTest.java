package br.com.javacore.zzrcodewar.testes;

import java.util.stream.IntStream;

public class FatoralZeroTest {

    public static void main(String[] args) {
        System.out.println(zeros(7));
    }

    private static int zeros(int number) {
        //int reduce = IntStream.rangeClosed(1, number).reduce(1, (int a, int b) -> a * b);
        int zeros = 0;

        while (number != 0) {
            zeros += (int) Math.floor(number / 5);
            number /= 5;
        }

        return zeros;
    }
}
