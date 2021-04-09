package br.com.javacore.zzagenerics.testes;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Romario");
        nomes.add("Bebeto");
        nomes.add("Dunga");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        teste(nomes, 1l);

        /*for (String nome : nomes) {
            System.out.println(nome);
        }*/


    }

    private static void teste(List lista, Long l) {
        lista.add(l);
    }
}
