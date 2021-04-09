package br.com.javacore.zzbclassesinternas.testes;

import br.com.javacore.zzbclassesinternas.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassesAnonimasTest {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            public void andar() {
                System.out.println("Andando apressadamente");
            }
        };

        animal.andar();

        System.out.println("------------------");

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Ferrari"));
        carros.add(new Carro("BMW"));

        Collections.sort(carros, new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(carros);
    }
}
class Animal {

    public void andar() {
        System.out.println("Andando");
    }
}
