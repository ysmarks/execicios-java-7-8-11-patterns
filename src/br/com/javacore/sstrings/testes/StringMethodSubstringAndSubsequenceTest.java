package br.com.javacore.sstrings.testes;

/**
 * Ambos os métodos retornam uma parte específica de uma determinada String,
 * sendo que o método substring retorna uma nova String e o método subSequence
 * retorna um CharSequence. É importante ressaltar que o CharSequence é uma interface
 * e a String é a implementação dessa interface
 */
public class StringMethodSubstringAndSubsequenceTest {

    public static void main(String[] args) {
        String texto = "Minas Gerais";
        System.out.println(texto.substring(0, 4));
        System.out.println(texto.subSequence(0, 4));
    }
}
