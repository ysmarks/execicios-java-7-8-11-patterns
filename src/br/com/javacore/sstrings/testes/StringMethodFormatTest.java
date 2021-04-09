package br.com.javacore.sstrings.testes;

/**
 * Como o próprio já sugere, o String.format realiza a formatação
 * de uma String de acordo com as especificações passadas
 */
public class StringMethodFormatTest {

    public static void main(String[] args) {
        /*String format = String.format("Hoje realizamos %,d pagamentos", 20);
        System.out.println(format);

        System.out.println("******************");

        format = String.format("20 / 3 = %,f2", 20.0 / 3.0);
        System.out.println(format);*/

        System.out.println(formatTest());
    }

    private static String formatTest() {
        int number = 20000;

        String result = String.format("Olha só esse valor %s.", number);
        return result;
    }
}
