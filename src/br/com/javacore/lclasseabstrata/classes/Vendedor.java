package br.com.javacore.lclasseabstrata.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Vendedor(String nome, String matricula, double salario, double totalVendas) {
        super(nome, matricula, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vendedor{");
        sb.append("totalVendas=").append(totalVendas);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calculaSalario() {
        salario = salario + (totalVendas * 0.15);
        return salario;
    }

    @Override
    public void imprime() {

    }
}
