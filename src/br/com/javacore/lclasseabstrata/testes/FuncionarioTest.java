package br.com.javacore.lclasseabstrata.testes;

import br.com.javacore.lclasseabstrata.classes.Gerente;
import br.com.javacore.lclasseabstrata.classes.Vendedor;

public class FuncionarioTest {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Faustão", "29485-9", 30000);
        Vendedor vendedor = new Vendedor("Rodrigo Faro", "11123-3", 19000, 80000);
        System.out.println("Salario gerente: " + gerente.calculaSalario());
        System.out.println("Salario vendedor: " +vendedor.calculaSalario());
    }
}
