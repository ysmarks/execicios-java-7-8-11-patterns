package br.com.javacore.sstrings.testes;

/**
 * Converte uma String em um Array de char, ou seja, uma String
 * de 10 posições irá ser convertida em um vetor char[] de 10 posições
 */
public class StringMethodToCharArrayTest {

    public static void main(String[] args) {
        String texto = "Bem-vindo ao Brasil";
        for(char c : texto.toCharArray()) {
            System.out.println(c);
        }
    }
}
