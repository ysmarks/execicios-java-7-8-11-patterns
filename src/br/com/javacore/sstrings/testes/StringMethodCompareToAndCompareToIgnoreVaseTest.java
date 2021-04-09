package br.com.javacore.sstrings.testes;

/***
 * Ambos fazem comparação de duas Strings, sendo que o primeiro (compareTo) considera
 * letras maiúsculas e minúsculas na comparação e o segundo (compareToIgnoreCase) ignora
 * qualquer diferença de minúsculas ou maiúsculas
 */
public class StringMethodCompareToAndCompareToIgnoreVaseTest {

    public static void main(String[] args) {

        String texto = "Curso - Java";
        System.out.println(texto.compareTo("Curso - Java") == 0 ? true : false);
        System.out.println(texto.compareTo("Curso - java") == 0 ? true : false);
        System.out.println(texto.compareToIgnoreCase("Curso - java") == 0 ? true : false);
    }
}
