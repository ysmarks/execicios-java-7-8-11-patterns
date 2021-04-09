package br.com.javacore.zzkstreams.classes;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Pessoa {

    private String nome;
    private int idade;
    private double salario;
    private Genero genero;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Pessoa(String nome, int idade, double salario, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
    }

    public static List<Pessoa> bancoDePessoas() {
        return asList(
                new Pessoa("Bebeto", 19, 25000, Genero.MASCULINO),
                new Pessoa("Romario", 43, 45000, Genero.MASCULINO),
                new Pessoa("Marta", 17, 22000, Genero.FEMININO),
                new Pessoa("Formiga", 18, 22000, Genero.FEMININO),
                new Pessoa("Aldai", 23, 15000, Genero.MASCULINO),
                new Pessoa("Tafarel", 16, 20000, Genero.MASCULINO),
                new Pessoa("Cafu", 24, 18000, Genero.MASCULINO),
                new Pessoa("Cristiane", 24, 15000, Genero.FEMININO));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pessoa{");
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }
}
