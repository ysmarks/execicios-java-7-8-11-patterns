package br.com.javacore.oexception.runtimeexception.testes;

public class RuntimeExeceptionTest {

    public static void main(String[] args) {

        //exemplo 1 ArithmeticException
//        int numero1 = 0;
//        int numero2 = 2;
//        int divisao = numero2 / numero1;
//        System.out.println(divisao);

        //exemplo 2 ArrayIndexOutOfBoundsException
//        int[] numeros = new int[2];
//        System.out.println(numeros[3]);
        divisao(20, 0);
    }

    public static void divisao(int num1, int num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("O valor tem que ser maior que " + num2);
        }
        int num3 = num1 / num2;

        System.out.println(num3);
    }
}
