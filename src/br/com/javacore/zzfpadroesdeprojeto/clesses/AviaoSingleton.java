package br.com.javacore.zzfpadroesdeprojeto.clesses;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {

    //Eager initialization
    //private static final AviaoSingleton INSTANCE = new AviaoSingleton();
    private static AviaoSingleton INSTANCE;
    private Set<String> assentosDisponiveis;

    //Lazy initialization
    public static AviaoSingleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new AviaoSingleton();
        }
        return INSTANCE;
    }

    private AviaoSingleton() {
        assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }
}
