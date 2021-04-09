package br.com.javacore.bintroducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNUmeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividiDoisNumeros(double num1, double num2) {
        if (num1 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void dividiDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não pode ser dividido por 0");
    }

    public void alterandoDoisNumeros(int num1, int num2) {
        num1 = 40;
        num2 = 50;
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArray(int[] numbers) {
        int soma = 0;
        for (int number : numbers) {
            soma += number;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numbers) {
        int soma = 0;
        for(int number : numbers) {
            soma +=number;
        }
        System.out.println(soma);
    }
}
