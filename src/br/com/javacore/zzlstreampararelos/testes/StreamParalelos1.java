package br.com.javacore.zzlstreampararelos.testes;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamParalelos1 {
    public static void main(String[] args) {
        long num = 10_000_000_000L;
        System.out.println(Runtime.getRuntime().availableProcessors());
        somaFor(num);
        //somaStreamIterate(num);
        //somaParalellStreamIterate(num);
        somaRangeClosedStream(num);
        somaRangeClosedParalellStream(num);
    }

    private static void somaFor(long num) {
        System.out.println("For");
        long result = 0;
        long inicio = System.currentTimeMillis();
        for (long i = 1l; i < num; i++) {
            result = +i;
        }
        long fim = System.currentTimeMillis();
        System.out.println(result + " " + (fim - inicio) + " ms");
    }

    private static void somaStreamIterate(long num) {
        System.out.println("Stream sequencial");
        long result = 0;
        long inicio = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0l, Long::sum);
        long fim = System.currentTimeMillis();
        System.out.println(result + " " + (fim - inicio) + " ms");
    }

    private static void somaParalellStreamIterate(long num) {
        System.out.println("Stream paralell");
        long result = 0;
        long inicio = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long fim = System.currentTimeMillis();
        System.out.println(result + " " +(fim - inicio) + " ms");
    }

    private static void somaRangeClosedStream(long num) {
        System.out.println("Range Closed Stream");
        long result = 0;
        long inicio = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long fim = System.currentTimeMillis();
        System.out.println(result + " " + (fim - inicio) + " ms");
    }

    private static void somaRangeClosedParalellStream(long num) {
        System.out.println("Range closed paralell stream");
        long result = 0;
        long inicio = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long fim = System.currentTimeMillis();
        System.out.println(result + " " + (fim - inicio) + " ms");

    }
}
