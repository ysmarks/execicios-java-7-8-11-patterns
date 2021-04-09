package br.com.javacore.zztdesignpattern.builder.testes;

import br.com.javacore.zztdesignpattern.builder.Pessoa;
import br.com.javacore.zztdesignpattern.builder.PessoalBuilder;
import br.com.javacore.zztdesignpattern.builder.Telefone;

public class CadastroBuilderTest {

    public static void main(String[] args) {

        Pessoa pessoa = PessoalBuilder.builder()
                .addNome("Ysmarks", "Santos")
                .addDtNascimento(1, 4, 2080)
                .addLogradouro("Rua Tal")
                .addNumero("50")
                .addBairro("Mogilar")
                .addComplemento("Ap")
                .addCidade("Mogi")
                .addPais("Brazil")
                .addFone(11, 946463215, Telefone.TipoFone.CELULAR)
                .addFone(11, 34521127, Telefone.TipoFone.RESIDENCIAL)
                .build();

        System.out.println(pessoa);
    }
}
