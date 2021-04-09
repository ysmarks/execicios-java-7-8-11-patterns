package br.com.javacore.zztdesignpattern.factorymethod.testes;

import br.com.javacore.zztdesignpattern.factorymethod.PessoaFactory;

public class PessoaFactoryTest {

    public static void main(String[] args) {
        PessoaFactory factory = new PessoaFactory();
        String nome = "Ale Tigre";
        String sexo = "M";
        factory.getPessoa(nome, sexo);
    }
}
