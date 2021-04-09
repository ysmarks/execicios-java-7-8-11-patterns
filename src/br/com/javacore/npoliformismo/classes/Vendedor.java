package br.com.javacore.npoliformismo.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public Vendedor() {

    }

    @Override
    public void calculaSalario() {
        salario = salario + (totalVendas * 0.1);
        System.out.println("Salario vendedor: " + salario);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
