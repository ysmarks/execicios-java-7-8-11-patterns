package br.com.javacore.zzagenerics.classes;

public class Carro {

    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carro{");
        sb.append("nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
