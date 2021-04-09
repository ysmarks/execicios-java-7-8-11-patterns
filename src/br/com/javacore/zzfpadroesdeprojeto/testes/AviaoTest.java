package br.com.javacore.zzfpadroesdeprojeto.testes;

import br.com.javacore.zzfpadroesdeprojeto.clesses.Aviao;

public class AviaoTest {
    public static void main(String[] args) {
       agendaAssento("1A");
       agendaAssento("1A");
    }

    private static void agendaAssento(String assento) {
        Aviao aviao = new Aviao();
        System.out.println(aviao.bookAssento(assento));
    }
}
