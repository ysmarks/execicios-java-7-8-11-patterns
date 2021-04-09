package br.com.javacore.eblocoinicializacao.testes;

import br.com.javacore.eblocoinicializacao.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        for(int parcela : cliente.getParcelas()) {
            System.out.println(parcela);
        }
    }
}
