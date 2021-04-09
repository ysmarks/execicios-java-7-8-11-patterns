package br.com.javacore.zztdesignpattern.abstractfactory;

public class Cliente {

    private ProdutoAbstratoA produtoAbstratoA;
    private ProdutoAbstratoB produtoAbstratoB;

    public Cliente(FabricaAbstrata fabrica) {
        produtoAbstratoA = fabrica.createProdutoA();
        produtoAbstratoB = fabrica.createProdutoB();
    }

    public void executar() {
        produtoAbstratoB.interagir(produtoAbstratoA);
    }
}
