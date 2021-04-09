package br.com.javacore.zcolecoes.testes;

import br.com.javacore.zcolecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {

    public static void main(String[] args) {
        Celular celular1 = new Celular("Samsung", "12848");
        Celular celular2 = new Celular("Motorola", "353546");
        Celular celular3 = new Celular("Sony", "578855");

        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for (Celular celular : celularList) {
            System.out.println(celular);
        }
        Celular celular4 = new Celular("Samsung", "12848");
        System.out.println(celular1.equals(celular4));
        System.out.println(celularList.contains(celular4));
    }
}
