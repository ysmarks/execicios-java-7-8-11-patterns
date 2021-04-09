package br.com.javacore.zzfpadroesdeprojeto.testes;

import br.com.javacore.zzfpadroesdeprojeto.clesses.AviaoSiglestonEnum;

public class AviaoSigletonEnumTest {
    public static void main(String[] args) {
        AviaoSiglestonEnum.agendarAssento("1A");
        AviaoSiglestonEnum.agendarAssento("1A");
    }
}
