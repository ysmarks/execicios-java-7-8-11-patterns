package br.com.javacore.zcolecoes.testes;

import br.com.javacore.zcolecoes.classes.Celular;

public class EqualsTest {
    public static void main(String[] args) {
        Celular cel1 = new Celular("Samsung", "1234");
        Celular cel2 = new Celular("Motorola", "1234");
        System.out.println(cel2.equals(cel1));
    }
}
