package br.com.javacore.sstrings.testes;

public class StringTest {

    public static void main(String[] args) {

        String nome1 = "Romario";
        nome1 = nome1.concat(" Souza Farias");// == nome1 += " Souza Farias"
        String nome2 = "Bebeto";

        System.out.println(nome1);
        System.out.println("Replace" + nome2.replace("B", "P"));
        //System.out.println(nome2.toLowerCase());
       // System.out.println(nome1.toUpperCase());
        System.out.println("Substring " + nome2.substring(0, 5));
        System.out.println("CharAt " + nome2.charAt(3));
    }
}
