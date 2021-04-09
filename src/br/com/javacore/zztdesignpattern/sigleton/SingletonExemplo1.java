package br.com.javacore.zztdesignpattern.sigleton;

public class SingletonExemplo1 {

    private static  SingletonExemplo1 INSTANCE;

    private SingletonExemplo1() {
    }

    public synchronized SingletonExemplo1 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonExemplo1();
        }

        return INSTANCE;
    }
}
