package br.com.javacore.minterfaces.classes;

public class GeradorExtratos {

    public void geradorConta(Conta conta) {
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
