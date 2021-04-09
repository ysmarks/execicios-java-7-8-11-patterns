package br.com.javacore.zztdesignpattern.abstractfactory;

public class ProdutoB2 implements ProdutoAbstratoB{
    @Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getName() + " interage com " + a.getClass().getName());
    }
}
