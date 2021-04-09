package br.com.javacore.zzrcodewar.testes;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class NumeroImparTest {

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));

    }

    private static int findIt(int[] numbers) {
        System.out.println("findIt");
        Map<Integer, Long> collect = IntStream.of(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return collect.entrySet()
                .stream()
                .filter(x -> x.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }

    private static int findIt2(int [] numbers) {
        System.out.println("findIt2");
        int aux = 0;
        for(int i = 0; i < numbers.length; i++) {
            aux ^= numbers[i];
        }
        return aux;
    }
}
