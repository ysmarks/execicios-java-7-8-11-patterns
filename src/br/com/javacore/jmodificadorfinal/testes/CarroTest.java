package br.com.javacore.jmodificadorfinal.testes;

import br.com.javacore.jmodificadorfinal.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getComprador());
        carro.getComprador().setNome("Tigre");
        System.out.println(carro.getComprador());
    }
}
