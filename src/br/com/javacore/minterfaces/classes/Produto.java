package br.com.javacore.minterfaces.classes;

public class Produto implements Tributavel, Transportavel {

    private String nome;
    private double preco;
    private double peso;
    private double totalImposto;
    private double toltaFrete;

    public Produto(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    @Override
    public void calculaFrete() {
        this.toltaFrete = this.preco / this.peso * 0.1;
        System.out.println(this.toltaFrete);
    }

    @Override
    public void calculaImposto() {
        this.totalImposto = this.preco + (this.preco * TRIBUTO);
        System.out.println(this.totalImposto);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Produto{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", peso=").append(peso);
        sb.append(", totalImposto=").append(totalImposto);
        sb.append(", toltaFrete=").append(toltaFrete);
        sb.append('}');
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
