package br.com.javacore.sstrings.strings2.testes;

import java.util.Locale;

public class MethodToUpperCaseAndToLowerCaseTest {

    public static void main(String[] args) {

        String texto = "O Brasil tomou 7 a 1 da Alemanha na Copa do Mundo da Fifa de 2014";

        System.out.println(texto);//Texto sem o toUpperCase
        System.out.println(texto.toUpperCase());//Texto com o metodo toUpperCase
        System.out.println(texto.toLowerCase());//Texto com o metodo toLowerCase
    }
}
