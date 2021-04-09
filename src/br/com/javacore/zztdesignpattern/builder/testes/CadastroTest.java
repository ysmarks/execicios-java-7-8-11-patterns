package br.com.javacore.zztdesignpattern.builder.testes;

import br.com.javacore.zztdesignpattern.builder.Endereco;
import br.com.javacore.zztdesignpattern.builder.Pessoa;
import br.com.javacore.zztdesignpattern.builder.Telefone;

import java.util.ArrayList;
import java.util.List;

public class CadastroTest {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rogerio");
        pessoa.setSobreNome("Ceni");
        pessoa.setDia(10);
        pessoa.setMes(2);
        pessoa.setAno(2021);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua tal");
        endereco.setNumero("110");
        endereco.setComplemento("Perto dali");
        endereco.setBairro("Da jujuba");
        endereco.setCidade("Porto real");
        endereco.setPais("Brasil");

        pessoa.setEndereco(endereco);

        List<Telefone> telefones = new ArrayList<>();
        Telefone  telefone1 = new Telefone();
        telefone1.setDdd(11);
        telefone1.setNumero(98754321);
        telefone1.setTipoFone(Telefone.TipoFone.CELULAR);

        Telefone telefone2 = new Telefone();
        telefone2.setDdd(11);
        telefone2.setNumero(45638795);
        telefone2.setTipoFone(Telefone.TipoFone.RESIDENCIAL);

        telefones.add(telefone1);
        telefones.add(telefone2);

        pessoa.setTelefones(telefones);

        System.out.println(pessoa);
    }
}
