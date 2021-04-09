package br.com.javacore.zzkstreams.testes;

import java.util.Arrays;
import java.util.List;

public class StreamMethodReduceTest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        Integer reduce = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce);

        List<String> words = Arrays.asList("a", "e", "i", "o", "u");
        String result = words.stream().reduce("", String::concat);
        System.out.println(result.equals("aeiou"));

        String result2 = words.stream().reduce("", (a, b) -> a.toUpperCase() + b.toUpperCase());
        System.out.println(result2);
    }
}
