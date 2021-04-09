package br.com.javacore.zzoagendador.testes;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class OrdenarNumerosImpares {
    /**
     * Você receberá uma série de números.
     * Você deve classificar os números ímpares em ordem crescente, deixando os números pares
     * em suas posições originais.
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {6,9,4,7,1,2,8,3};
        System.out.println(sortNumbers(array));
    }

    public static int[] sortNumbers(int[] arrays) {
        int[] ints = Arrays.stream(arrays)
                .filter(e -> e % 2 == 1)
                .sorted()
                .toArray();
        for (int j = 0, s = 0; j < arrays.length; j++) {
            if (arrays[j] % 2 == 1)
                arrays[j] = ints[s++];
        }
        return arrays;
    }
}
