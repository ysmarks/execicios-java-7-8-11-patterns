package br.com.javacore.zzagenerics.testes;

import br.com.javacore.zzagenerics.classes.Carro;
import br.com.javacore.zzagenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Ferrari"));
        carros.add(new Carro("bmw"));

        ObjetosAlugaveis<Carro> carroObjetosAlugaveis = new ObjetosAlugaveis<>(carros);
        Carro objetosDisponiveis = carroObjetosAlugaveis.getObjetosDisponiveis();
        System.out.println("Devolver carro depois de um mês: " + objetosDisponiveis);
        carroObjetosAlugaveis.devolverObjeto(objetosDisponiveis);

        System.out.println("---------------------------------------");

        List<Computador> computadors = new ArrayList<>();
        computadors.add(new Computador("Dell"));
        computadors.add(new Computador("HP"));
        computadors.add(new Computador("Lenovo"));

        ObjetosAlugaveis<Computador> computadorObjetosAlugaveis = new ObjetosAlugaveis<>(computadors);
        Computador objetosDisponiveis1 = computadorObjetosAlugaveis.getObjetosDisponiveis();
        System.out.println("Devolvendo computador depois de um mês: " + objetosDisponiveis);
        computadorObjetosAlugaveis.devolverObjeto(objetosDisponiveis1);

    }
}

class ObjetosAlugaveis<T> {

    private List<T> objetosDisponiveis = new ArrayList<>();

    public ObjetosAlugaveis(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T getObjetosDisponiveis() {
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto:" + t);
        System.out.println("Objetos disponiveis: " + objetosDisponiveis);
        return t;
    }

    public void devolverObjeto(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis: " + objetosDisponiveis);
    }
}
