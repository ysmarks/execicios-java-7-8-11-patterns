package br.com.javacore.dsobrecargaconstrutor.classes;

public class Estudante {

    private String matricula;
    private String nome;
    private double[] notas;
    private boolean aprovado;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, boolean aprovado) {
        this(matricula, nome, notas);
        this.aprovado = aprovado;
    }

    public Estudante() {}

    public void imprime() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for(double nota : this.notas) {
            System.out.println(nota);
        }
        System.out.println(this.aprovado);
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
