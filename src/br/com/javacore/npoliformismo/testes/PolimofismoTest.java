package br.com.javacore.npoliformismo.testes;

import br.com.javacore.npoliformismo.classes.FolhaPagamento;
import br.com.javacore.npoliformismo.classes.Gerente;
import br.com.javacore.npoliformismo.classes.Vendedor;

public class PolimofismoTest {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Tulio", 25000, 2000);
        Vendedor vendedor = new Vendedor("Vava", 4500, 25000);
        FolhaPagamento pagamento = new FolhaPagamento();
        pagamento.relatorioPagamento(gerente);
        gerente.calculaSalario();
        pagamento.relatorioPagamento(vendedor);
        vendedor.calculaSalario();
    }
}
