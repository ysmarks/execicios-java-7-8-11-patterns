package br.com.javacore.minterfaces.testes;

import br.com.javacore.minterfaces.classes.Produto;

public class ProdutoTest {

    public static void main(String[] args) {

        Produto produto = new Produto("Batata", 5, 3 );
        System.out.println(produto);
        produto.calculaFrete();
        produto.calculaImposto();
    }
}
