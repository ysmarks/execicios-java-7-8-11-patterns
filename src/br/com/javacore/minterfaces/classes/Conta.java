package br.com.javacore.minterfaces.classes;

public interface Conta {

    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}
