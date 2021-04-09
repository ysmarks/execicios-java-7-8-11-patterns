package br.com.javacore.npoliformismo.classes;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Funcionario{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

    public abstract void calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
