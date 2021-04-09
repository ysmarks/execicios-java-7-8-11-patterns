package br.com.javacore.zcolecoes.testes;

import br.com.javacore.zcolecoes.classes.Produto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1l, "feijão", 4.99, 5);
        Produto produto2 = new Produto(2l, "arroz", 12.59, 2);
        Produto produto3 = new Produto(3l, "macarrão", 2.99, 10);
        Produto produto4 = new Produto(4l, "farinha", 3.49, 1);
        Produto produto5 = new Produto(4l, "oleo", 2.29, 2);

        Set<Produto> produtos = new HashSet<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        /*Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getPreco() < 4.98) {
                iterator.remove();
            }
        }
        System.out.println(produtos);*/
    }
}
