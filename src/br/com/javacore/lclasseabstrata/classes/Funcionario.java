package br.com.javacore.lclasseabstrata.classes;

public abstract  class Funcionario extends Pessoa {

    protected String matricula;
    protected double salario;

    public Funcionario() {}

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void imprime() {
        System.out.println("Teste");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Funcionario{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

    public abstract double calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
