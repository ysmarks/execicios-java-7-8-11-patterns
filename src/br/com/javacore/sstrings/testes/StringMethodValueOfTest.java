package br.com.javacore.sstrings.testes;

/**
 *Este método converte diversos tipos (booleano, inteiro, char, double, float, long, Object e etc) para String
 */
public class StringMethodValueOfTest {

    public static void main(String[] args) {
        boolean b = false;
        System.out.println(String.valueOf(b));

        float f = -10.0f;

        System.out.println(String.valueOf(f));
    }
}
