package br.com.javacore.zzagenerics.classes;

public class Computador {

    private String nome;

    public Computador(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Computador{");
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
