package br.com.javacore.sstrings.testes;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder(5);
        builder.append("1, 2, 3, 4, 5");
        System.out.println(builder.insert(1, "20"));
        System.out.println(builder.reverse());

    }
}
