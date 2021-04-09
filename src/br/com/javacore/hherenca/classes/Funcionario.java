package br.com.javacore.hherenca.classes;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Bloco de inicialização estatico funcionario");
    }
    {
        System.out.println("Bloco de inicialização funcionario 1");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }
    public void print() {
        System.out.println("--------Relatorio funcionario--------");
        super.print();
        System.out.println("Salario: " + this.salario);
        imprimeSalario();
    }

    public void imprimeSalario() {
        System.out.println("Eu, " + super.nome + " recbi R$ " + this.salario + " de salario");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
