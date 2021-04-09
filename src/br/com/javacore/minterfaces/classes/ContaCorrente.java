package br.com.javacore.minterfaces.classes;

public class ContaCorrente implements Conta{

    private double saldo;

    private double taxaOperacao;


    @Override
    public void depositar(double valor) {
        this.saldo += valor - this.taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor + this.taxaOperacao;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
