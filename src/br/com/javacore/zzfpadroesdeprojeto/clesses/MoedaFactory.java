package br.com.javacore.zzfpadroesdeprojeto.clesses;

public class MoedaFactory {

    public static Moeda criarMoeda(PaisEnum paisEnum) {
        if (paisEnum.equals(PaisEnum.BRASZIL)) {
            return new Real();
        }else if (paisEnum.equals(PaisEnum.EUA)) {
            return new Dolar();
        }else {
            throw new IllegalArgumentException("Moeda não existe");
        }
    }
}
