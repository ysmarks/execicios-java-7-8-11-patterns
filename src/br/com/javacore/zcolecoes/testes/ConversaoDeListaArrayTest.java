package br.com.javacore.zcolecoes.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListaArrayTest {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(23);
        integers.add(8);
        integers.add(3);
        integers.add(17);

        Integer[] integers1 = new Integer[integers.size()];
        integers.toArray(integers1);
        for (Integer integer : integers1) {
            System.out.println(integer);
        }
        System.out.println("-------------------");
        Integer[] integers2 = new Integer[4];
        integers2[0] = 3;
        integers2[1] = 21;
        integers2[2] = 6;
        integers2[3] = 33;

        List<Integer> integerList = Arrays.asList(integers1);
        System.out.println(integerList.toString());
        System.out.println(integerList);

        List<Integer> integers3 = new ArrayList<>();
        integers3.addAll(integerList);
        integers3.add(0,40);
        System.out.println(integerList.toString());
        System.out.println(integerList);


    }
}
