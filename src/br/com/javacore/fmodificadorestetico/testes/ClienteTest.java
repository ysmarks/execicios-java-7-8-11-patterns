package br.com.javacore.fmodificadorestetico.testes;

import br.com.javacore.fmodificadorestetico.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        for (double parcela : cliente.getParcelas()) {
            System.out.println(parcela);
        }
    }
}
