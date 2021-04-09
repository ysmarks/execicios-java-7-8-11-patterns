package br.com.javacore.sstrings.testes;

/**
 * O método endsWith verifica se a String termina com o valor especificado,
 * por outro lado o startsWith verifica se a String começa com o valor especificado.
 * Sendo que o método startsWith tem duas variações: uma com o parâmetro “int toffset”
 * e outra sem, onde o método que contém o parâmetro “int toffset” serve para dizer de
 * onde deve começar a verificação do inicio da String.
 */
public class StringMethodEndsWithAndStarsWithTest {

    public static void main(String[] args) {
        String texto = "Alagoas";
        System.out.println(texto.endsWith("oas"));
        System.out.println(texto.startsWith("Al"));
        System.out.println(texto.startsWith("go", 3));
    }
}
