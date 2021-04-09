package br.com.javacore.zzgcomportamentoporparametro.interfaces;

import br.com.javacore.zzgcomportamentoporparametro.classes.Carro;

public interface CarroPredicate {
    boolean test(Carro carro);
}
