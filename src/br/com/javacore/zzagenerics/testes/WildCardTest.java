package br.com.javacore.zzagenerics.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

class Cachorro extends Animal implements Comparable<Cachorro> {

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }

    @Override
    public int compareTo(Cachorro o) {
        return 0;
    }
}

public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatoes = {new Gato(), new Gato()};

        //consultaAnimal(cachorros);
        //consultaAnimal(gatoes);

        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());

        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());

        //consultaAnimalLis(cachorroList);
        //consultaAnimalLis(gatoList);
        ordenarLista(cachorroList);


    }

    public static void consultaAnimalLis(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    public static void consultaAnimal(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    public static void consultaCachorro(List<? super Cachorro> objects) {
        Cachorro cachorro = new Cachorro();
        Animal cachorro2 = new Cachorro();
        Object cachorro3 = new Cachorro();
    }

    public static void ordenarLista(List<? extends Comparable> list) {
        Collections.sort(list);
    }
}
