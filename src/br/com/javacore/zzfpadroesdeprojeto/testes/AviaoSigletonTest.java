package br.com.javacore.zzfpadroesdeprojeto.testes;

import br.com.javacore.zzfpadroesdeprojeto.clesses.AviaoSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AviaoSigletonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        agendarAssento("1A");
        agendarAssento("1A");

        AviaoSingleton as1 = AviaoSingleton.getINSTANCE();
        AviaoSingleton as2 = null;

        Constructor[] constructors = AviaoSingleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            as2 = (AviaoSingleton) constructor.newInstance();
            break;
        }

        System.out.println(as1.hashCode());
        System.out.println(as2.hashCode());

    }

    private static void agendarAssento(String assento) {
        AviaoSingleton aviaoSingleton = AviaoSingleton.getINSTANCE();
        System.out.println(aviaoSingleton.bookAssento(assento));
    }
}
