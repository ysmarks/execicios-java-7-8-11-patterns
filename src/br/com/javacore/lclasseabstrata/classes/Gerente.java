package br.com.javacore.lclasseabstrata.classes;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Gerente{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculaSalario() {
        salario = salario + (salario * 0.2);
        return salario;
    }
}
