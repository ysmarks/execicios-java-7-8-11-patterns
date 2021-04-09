package br.com.javacore.bintroducaometodos.testes;

import br.com.javacore.bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNUmeros(5, 5);
        System.out.println(calculadora.dividiDoisNumeros(20,6));
        calculadora.dividiDoisNumeros2(20, 0);

        System.out.println("-----------------------------");
        int num1 = 2;
        int num2 = 3;
        calculadora.alterandoDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("*****************************");
        int[] numbers = {2,4,6,8};
        calculadora.somaArray(numbers);

        System.out.println("******************************");
        calculadora.somaVarArgs(3,6,9,12);
    }
}
