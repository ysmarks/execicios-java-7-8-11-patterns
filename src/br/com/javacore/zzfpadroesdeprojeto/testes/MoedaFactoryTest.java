package br.com.javacore.zzfpadroesdeprojeto.testes;

import br.com.javacore.zzfpadroesdeprojeto.clesses.Moeda;
import br.com.javacore.zzfpadroesdeprojeto.clesses.MoedaFactory;
import br.com.javacore.zzfpadroesdeprojeto.clesses.PaisEnum;

public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(PaisEnum.BRASZIL);
        System.out.println(moeda.getSimbolo());
    }
}
