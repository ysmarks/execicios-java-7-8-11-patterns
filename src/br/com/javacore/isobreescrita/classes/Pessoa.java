package br.com.javacore.isobreescrita.classes;

public class Pessoa {

    private String nome;
    private int idade;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", idade=").append(idade);
        sb.append('}');
        return sb.toString();
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
