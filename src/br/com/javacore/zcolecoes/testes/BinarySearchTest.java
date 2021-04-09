package br.com.javacore.zcolecoes.testes;

import br.com.javacore.zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);

        Collections.sort(integerList);
        System.out.println(Collections.binarySearch(integerList, 2));

        List<Produto> produtoList = new ArrayList<>();
        Produto produto1 = new Produto(1l, "Radio", 124.00);
        Produto produto2 = new Produto(2l, "tv", 1139.90);
        Produto produto3 = new Produto(3l, "carro", 35467.78);

        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);

        Produto produto4 = new Produto(4l, "lavadoura", 897.90);
        Collections.sort(produtoList, new ProdutoNomeCompatator());
        System.out.println(Collections.binarySearch(produtoList, produto4, new ProdutoNomeCompatator()));
        for (Produto produto : produtoList) {
            System.out.println(produto);
        }

        Integer[] integers = new Integer[4];
        integers[0] = 3;
        integers[1] = 4;
        integers[2] = 0;
        integers[3] = 1;

        Arrays.sort(integers);
        System.out.println(Arrays.binarySearch(integers, 3));
    }
}
