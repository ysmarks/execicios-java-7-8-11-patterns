package br.com.javacore.hherenca.classes;

public class Pessoa {

    protected String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Dentro do construtor de pessoa");
    }
    {
        System.out.println("Bloco de inicialização pessoa 2");
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + ", Bairro: " + this.endereco.getBairo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
