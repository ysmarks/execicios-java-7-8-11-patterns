package br.com.javacore.zcolecoes.testes;

import br.com.javacore.zcolecoes.classes.Consumidor;
import br.com.javacore.zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {

    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Tigre", "546");
        Consumidor consumidor2 = new Consumidor("Leão", "408");

        Produto produto1 = new Produto(2l, "goiaba", 4.59, 6);
        Produto produto2 = new Produto(3l, "maça", 6.39, 10);
        Produto produto3 = new Produto(4l, "pera", 9.19, 8);
        Produto produto4 = new Produto(5l, "uva", 7.59, 1);
        Produto produto5 = new Produto(6l, "caqui", 6.69, 8);
        Produto produto6 = new Produto(7l, "kiwi", 10.99, 7);

        List<Produto> produtoList1 = new ArrayList<>();
        produtoList1.add(produto1);
        produtoList1.add(produto3);
        produtoList1.add(produto5);

        List<Produto> produtoList2 = new ArrayList<>();
        produtoList2.add(produto2);
        produtoList2.add(produto4);
        produtoList2.add(produto6);

        Map<Consumidor, List<Produto>> consumidorLisMap = new HashMap<>();
        consumidorLisMap.put(consumidor1, produtoList1);
        consumidorLisMap.put(consumidor2, produtoList2);

        for (Map.Entry<Consumidor, List<Produto>> entry : consumidorLisMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome());
            }
        }
    }
}
