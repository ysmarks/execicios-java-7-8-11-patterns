package br.com.javacore.sstrings.strings2.testes;

public class MethodTrimTest {

    public static void main(String[] args) {

        String texto = "    Goias     ";
        System.out.println("Sem o metodo trim:" + texto);
        System.out.println("Com o metodo trim:" + texto.trim());
    }
}
