package br.com.javacore.minterfaces.testes;

import br.com.javacore.minterfaces.classes.ContaCorrente;
import br.com.javacore.minterfaces.classes.ContaPoupanca;
import br.com.javacore.minterfaces.classes.GeradorExtratos;

public class ContasTest {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(500);
        cc.sacar(100);


        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(1000);
        cp.sacar(50);

        GeradorExtratos ge = new GeradorExtratos();
        ge.geradorConta(cc);
        ge.geradorConta(cp);
    }
}
