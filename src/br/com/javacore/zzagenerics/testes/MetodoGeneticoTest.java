package br.com.javacore.zzagenerics.testes;

import java.util.ArrayList;
import java.util.List;

public class MetodoGeneticoTest {
    public static void main(String[] args) {
        testeSemRetorno(new String("Alagoas"));
        Integer integer = testeComRetorno(3);
        System.out.println(integer);
    }

    public static <T> void testeSemRetorno(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        for (T e : lista) {
            System.out.println(e);
        }
    }

    public static <T> T testeComRetorno(T t ) {
        return t;

    }
}
