package br.com.javacore.sstrings.testes;

public class StringMethodCodePointAtTest {
    public static void main(String[] args) {
        //Retorna o valor em UNICODE do caractere especificado no index do parâmetro
        String texto = "Rio de janeiro";
        System.out.println(texto.codePointAt(2));
    }
}
