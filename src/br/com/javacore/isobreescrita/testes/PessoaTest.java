package br.com.javacore.isobreescrita.testes;

import br.com.javacore.isobreescrita.classes.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lugano");
        pessoa.setIdade(43);
        System.out.println(pessoa);
    }
}
