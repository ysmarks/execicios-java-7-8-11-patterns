package br.com.javacore.zzqrecursividade.classes;

import java.util.stream.IntStream;

public class Fatorial {

    public long fibonacci(int number) {
        if(number == 0) {
            return 1;
        }
        return number * fibonacci(number - 1);
    }

    public int fatoralUsandoFor(int number) {
        int aux = 1;

        for (int i = 2; i <= number; i++) {
            aux *= i;
        }

        return aux;
    }

    public int fatoralUsandoStream(int number) {
        return IntStream.rangeClosed(1, number)
                .reduce(1, (int a, int b) -> a * b);
    }
}
