package br.com.javacore.fmodificadorestetico.testes;

import br.com.javacore.fmodificadorestetico.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {

        Carro.velocidadeLimite = 200;
        Carro c1 = new Carro("Ferrari", 320);
        Carro c2 = new Carro("BMW", 280);
        Carro c3= new Carro("Audi", 285);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("###########################");

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
