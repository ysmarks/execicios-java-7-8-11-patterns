package br.com.javacore.zztdesignpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class PessoalBuilder {

    private Pessoa pessoa;
    private Endereco endereco;
    private List<Telefone> telefones;

    public PessoalBuilder() {
        this.pessoa = new Pessoa();
        this.endereco = new Endereco();
        this.telefones = new ArrayList<>();
    }

    public static PessoalBuilder builder() {
        return new PessoalBuilder();
    }

    public PessoalBuilder addNome(String nome, String sobreNome) {
        this.pessoa.setNome(nome);
        this.pessoa.setSobreNome(sobreNome);
        return this;
    }

    public PessoalBuilder addDtNascimento(int dia, int mes, int ano) {

        this.pessoa.setDia(dia);
        this.pessoa.setMes(mes);
        this.pessoa.setAno(ano);

        return this;
    }

    public PessoalBuilder addLogradouro(String logradouro) {

        this.endereco.setLogradouro(logradouro);

        return this;
    }

    public PessoalBuilder addNumero(String numero) {

        this.endereco.setNumero(numero);

        return this;
    }

    public PessoalBuilder addBairro(String bairro) {

        this.endereco.setBairro(bairro);

        return this;
    }

    public PessoalBuilder addCidade(String cidade) {

        this.endereco.setCidade(cidade);

        return this;
    }

    public PessoalBuilder addComplemento(String complemento) {

        this.endereco.setComplemento(complemento);

        return this;
    }

    public PessoalBuilder addPais(String pais) {

        this.endereco.setPais(pais);

        return this;
    }

    public PessoalBuilder addFone(int ddd, int numero, Telefone.TipoFone tipoFone) {

        this.telefones.add(new Telefone(ddd, numero, tipoFone));

        return this;
    }

    public Pessoa build() {

        this.pessoa.setEndereco(this.endereco);
        this.pessoa.setTelefones(this.telefones);

        return this.pessoa;
    }

}
