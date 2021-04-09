package br.com.javacore.rwrappers.testes;

public class WrappersTest {

    public static void main(String[] args) {

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = 2;
        Long longWrapper = 1l;
        Float floatWrapper = 2f;
        Double doubleWrapper= 300d;
        Character characterWrapper = 'a';
        Boolean booleanWrapper = false;

        System.out.println(Character.isDigit('2'));
        String num = "123";
        System.out.println(Byte.parseByte(num));
    }
}
