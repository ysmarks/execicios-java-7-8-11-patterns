package br.com.javacore.zztdesignpattern.sigleton;

public class GerenciadorDejanelasExemplo2 {

    private static final GerenciadorDejanelasExemplo2 INSTANCE = new GerenciadorDejanelasExemplo2();

    private GerenciadorDejanelasExemplo2() {

    }

    public static GerenciadorDejanelasExemplo2 getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
