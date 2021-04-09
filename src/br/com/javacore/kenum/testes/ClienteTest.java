package br.com.javacore.kenum.testes;

import br.com.javacore.kenum.classes.Cliente;
import br.com.javacore.kenum.classes.TipoCliente;

public class ClienteTest {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Thiago", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(cliente);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());

    }
}
