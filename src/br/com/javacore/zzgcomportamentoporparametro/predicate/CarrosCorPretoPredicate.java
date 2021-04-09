package br.com.javacore.zzgcomportamentoporparametro.predicate;

import br.com.javacore.zzgcomportamentoporparametro.classes.Carro;
import br.com.javacore.zzgcomportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorPretoPredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("preto");
    }
}
