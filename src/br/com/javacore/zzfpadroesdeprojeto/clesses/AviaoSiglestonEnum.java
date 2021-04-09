package br.com.javacore.zzfpadroesdeprojeto.clesses;

import java.util.HashSet;
import java.util.Set;

public enum AviaoSiglestonEnum {
    INSTANCE;
    private Set<String> assentosDisponiveis;

    private AviaoSiglestonEnum() {
        assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }

    public static void agendarAssento(String assento) {
        AviaoSiglestonEnum aviaoSingleton = AviaoSiglestonEnum.INSTANCE;
        System.out.println(aviaoSingleton.bookAssento(assento));
    }
}
