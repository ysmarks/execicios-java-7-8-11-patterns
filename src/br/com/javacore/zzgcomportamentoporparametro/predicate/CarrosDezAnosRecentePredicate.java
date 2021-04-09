package br.com.javacore.zzgcomportamentoporparametro.predicate;

import br.com.javacore.zzgcomportamentoporparametro.classes.Carro;
import br.com.javacore.zzgcomportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}
