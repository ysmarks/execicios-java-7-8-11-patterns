package br.com.javacore.fmodificadorestetico.classes;

public class Carro {

    private String marca;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 300;

    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public void imprime() {
        System.out.println("--------------------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("velocidade Limite: " + velocidadeLimite);
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
