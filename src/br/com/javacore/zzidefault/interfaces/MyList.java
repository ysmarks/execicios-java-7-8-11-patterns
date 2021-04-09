package br.com.javacore.zzidefault.interfaces;

public interface MyList {

    static void sort() {
        System.out.println("Dentro do sort");
    }

    default void remover() {
        System.out.println("Dentro do remover");
    }

    void add();
}
