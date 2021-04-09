package br.com.javacore.sstrings.testes;

/**
 * O método trim remove espaços em branco no inicial e no final da String
 */
public class StringMethodTrimTest {

    public static void main(String[] args) {

        String texto = " Goias ";
        System.out.println("Sem trim: " + texto);
        System.out.println("Com trim :" + texto.trim());
    }
}
