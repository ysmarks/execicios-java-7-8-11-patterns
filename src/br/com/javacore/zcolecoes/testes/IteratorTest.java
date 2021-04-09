package br.com.javacore.zcolecoes.testes;

import br.com.javacore.zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto(1l, "Batata", 3.50, 10);
        Produto produto2 = new Produto(2l, "Cenoura", 2.85, 0);
        Produto produto3 = new Produto(3l, "Beteraba", 1.99, 8);
        Produto produto4 = new Produto(4l, "Chuchu", 1.50, 20);
        Produto produto5 = new Produto(5l, "Repolho", 4.39, 0);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        Iterator<Produto> iterator = produtos.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getQuantidade() == 0) {
               iterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
}
