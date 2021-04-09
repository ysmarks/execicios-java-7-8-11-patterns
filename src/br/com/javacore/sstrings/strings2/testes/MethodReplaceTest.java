package br.com.javacore.sstrings.strings2.testes;

public class MethodReplaceTest {

    public static void main(String[] args) {

        String texto = "O pato gosta de nada na lagoa a noite.";

        System.out.println(texto.replace("pato", "rato"));

        //o replace e case sentive
        //Por exemplo
        String texto1 = "A batalha está travada na rua dos camelos";
        System.out.println(texto1.replace("Camelos", "leoes"));
    }
}
