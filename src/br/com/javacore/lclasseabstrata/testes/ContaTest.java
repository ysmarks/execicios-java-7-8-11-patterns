package br.com.javacore.lclasseabstrata.testes;

import br.com.javacore.lclasseabstrata.classes.Conta;
import br.com.javacore.lclasseabstrata.classes.ContaPoupanca;

public class ContaTest {

    public static void main(String[] args) {
        Conta conta = new ContaPoupanca();
        conta.setSaldo(234565);
        conta.imprimeExtrato();
    }
}
