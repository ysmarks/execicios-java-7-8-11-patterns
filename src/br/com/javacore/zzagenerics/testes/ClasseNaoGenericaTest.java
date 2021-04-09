package br.com.javacore.zzagenerics.testes;

import br.com.javacore.zzagenerics.classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTest {
    public static void main(String[] args) {
        CarroAlugado carroAlugado = new CarroAlugado();
        Carro carroDisponivel = carroAlugado.getCarroDisponivel();
        System.out.println("Usando Carro por um mês");
        carroAlugado.devolverCarro(carroDisponivel);

    }
}

class CarroAlugado {
    private List<Carro> carrosDisponiveis = new ArrayList<>();

    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("bmw"));
    }

    public Carro getCarroDisponivel() {
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponiveis: " + carrosDisponiveis);
        return carro;
    }

    public void devolverCarro(Carro carro) {
        System.out.println("Devolver carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis: " + carrosDisponiveis);
    }
}