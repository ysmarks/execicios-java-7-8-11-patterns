package br.com.javacore.zzhlambdas.interfaces;

import br.com.javacore.zzhlambdas.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}
