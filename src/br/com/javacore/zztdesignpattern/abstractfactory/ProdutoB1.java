package br.com.javacore.zztdesignpattern.abstractfactory;

public class ProdutoB1 implements ProdutoAbstratoB{
    @Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getName() + " integrage com " + a.getClass().getName());
    }
}
