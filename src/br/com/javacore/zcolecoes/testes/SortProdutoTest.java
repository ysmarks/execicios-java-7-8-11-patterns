package br.com.javacore.zcolecoes.testes;

import br.com.javacore.zcolecoes.classes.Produto;

import java.util.*;

class ProdutoNomeCompatator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}
public class SortProdutoTest {

    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>();
        Produto[] produtos = new Produto[4];
        Produto produto1 = new Produto(1l, "Laptop Dell", 2000.0);
        Produto produto2 = new Produto(2l, "Tv Samsung", 3000.0);
        Produto produto3 = new Produto(3l, "Teclado Razer", 39.0);
        Produto produto4 = new Produto(4l, "Celular Sansumg Galaxy", 3250.0);

        produtos[0] = produto1;
        produtos[1] = produto2;
        produtos[2] = produto3;
        produtos[3] = produto4;

        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);

        Collections.sort(produtoList, new ProdutoNomeCompatator());

//        for (Produto produto : produtoList) {
//            System.out.println(produto);
//        }
       // System.out.println(Arrays.toString(produtos));
        Arrays.sort(produtos, new ProdutoNomeCompatator());
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
