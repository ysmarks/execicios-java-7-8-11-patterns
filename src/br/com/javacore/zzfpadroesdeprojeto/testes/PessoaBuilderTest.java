package br.com.javacore.zzfpadroesdeprojeto.testes;

import br.com.javacore.zzfpadroesdeprojeto.clesses.Pessoa;

public class PessoaBuilderTest {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.Builder()
                .nome("Ysmarks")
                .sobreNome("Santos")
                .cpf("000.111.222-33")
                .rg("456.465-54")
                .telefone("11374656")
                .email("ysmarks@email.com")
                .build();
        System.out.println(pessoa);
    }
}
