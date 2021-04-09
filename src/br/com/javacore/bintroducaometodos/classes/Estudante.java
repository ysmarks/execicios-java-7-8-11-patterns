package br.com.javacore.bintroducaometodos.classes;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

}
