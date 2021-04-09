package br.com.javacore.uexpressoesregulares.testes;

public class TokenTest {
    public static void main(String[] args) {
        //Forma simples de trabalhar com tokens com a classe String
        String str = "Romario, Bebeto, Dunga, Rai, Cafu";
        String[] tokens = str.split(",");
        for (String token : tokens) {
            System.out.println(token.trim());
        }
    }
}
