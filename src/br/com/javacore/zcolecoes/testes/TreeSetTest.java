package br.com.javacore.zcolecoes.testes;

import br.com.javacore.zcolecoes.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        Produto produto1 = new Produto(10l, "geladeira", 3350.00, 1);
        Produto produto2 = new Produto(11l, "fogão", 1280.00, 2);
        Produto produto3 = new Produto(12l, "tvs", 1150.00, 5);
        Produto produto4 = new Produto(13l, "cama", 980.00, 8);
        Produto produto5 = new Produto(14l, "carro", 72850.00, 2);

        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);

        for (Produto produto : produtoNavigableSet.descendingSet()) {
            System.out.println(produto);
        }
        System.out.println("-------------------");
        //outros metodos
        System.out.println(produtoNavigableSet.lower(produto3));
        System.out.println(produtoNavigableSet.floor(produto4));
        System.out.println(produtoNavigableSet.higher(produto1));
    }
}
