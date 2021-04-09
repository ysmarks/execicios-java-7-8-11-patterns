package br.com.javacore.hherenca.testes;

import br.com.javacore.hherenca.classes.Endereco;
import br.com.javacore.hherenca.classes.Funcionario;

public class HerancaTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Ronaldo");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua das dores");
        endereco.setBairo("Barro Duro");

        funcionario.setCpf("123456789");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(24000);
        funcionario.print();

    }
}
