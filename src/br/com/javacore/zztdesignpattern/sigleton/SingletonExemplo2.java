package br.com.javacore.zztdesignpattern.sigleton;

public class SingletonExemplo2 {

    private static SingletonExemplo2 INSTANCE = new SingletonExemplo2();

    private SingletonExemplo2() {
        System.out.println("Dentro do construtor");
    }

    public static SingletonExemplo2 getInstance() {
        return INSTANCE;
    }
}
