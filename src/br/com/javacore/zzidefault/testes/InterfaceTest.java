package br.com.javacore.zzidefault.testes;

import br.com.javacore.zzidefault.interfaces.MyList;

public class InterfaceTest implements MyList {

    public static void main(String[] args) {
        new InterfaceTest().remover();
        MyList.sort();
    }

    @Override
    public void add() {
        System.out.println("Dentro do add");
    }
}
