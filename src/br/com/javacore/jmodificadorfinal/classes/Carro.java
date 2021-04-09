package br.com.javacore.jmodificadorfinal.classes;

public class Carro {

    public final static double VELOCIDADE_LIMITE;
    private final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    static {
        VELOCIDADE_LIMITE = 200;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carro{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Comprador getComprador() {
        return comprador;
    }
}
