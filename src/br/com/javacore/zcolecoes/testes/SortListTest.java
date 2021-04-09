package br.com.javacore.zcolecoes.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ronaldo");
        nomes.add("Adriano");
        nomes.add("Kaka");
        nomes.add("Ronaldinho Gaucho");
        nomes.add("Dida");

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2.1);
        doubleList.add(1.4);
        doubleList.add(2.7);
        doubleList.add(5.1);
        doubleList.add(3.7);

        Collections.sort(doubleList);

        for (Double aDouble : doubleList) {
            System.out.println(aDouble);
        }
    }
}
