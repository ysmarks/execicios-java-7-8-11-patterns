package br.com.javacore.csobrecargametodos.testes;

import br.com.javacore.csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Tigre", "111.222.333-44", 5400, "4242323");
        funcionario.imprime();
    }
}
