package br.com.javacore.npoliformismo.classes;

public class Gerente extends Funcionario {

    private double pnl;

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    public Gerente() {
    }


    @Override
    public void calculaSalario() {
        salario = salario + pnl;
        System.out.println("Salario gerente: " + salario);
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
