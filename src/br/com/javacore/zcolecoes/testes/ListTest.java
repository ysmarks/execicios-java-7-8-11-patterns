package br.com.javacore.zcolecoes.testes;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        lista1.add("Bebeto");
        lista1.add("Romario");
        lista1.add("Zinho");

        //lista1.clear();

        lista2.add("Rai");
        lista2.add("Dunga");

        lista1.addAll(lista2);

        for (int i = 0; i < lista1.size(); i ++) {
            System.out.println(lista1.get(i));
        }

       /* for (String nome :lista1) {
            System.out.println(nome);
        }*/
    }
}
