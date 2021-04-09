package br.com.javacore.zzjoptional.classes;

import java.util.Optional;

public class Pessoa {
    private Carro carro;
    private String nome;
    private int idade;

    public Pessoa(Carro carro, String nome) {
        this.carro = carro;
        this.nome = nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pessoa{");
        sb.append("carro=").append(carro);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Optional<Carro> getCarro() {
        return Optional.ofNullable(carro);
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
