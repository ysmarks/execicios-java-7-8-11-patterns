package br.com.javacore.zzsmath.testes;

public class MetodosClasseMathTest {
    public static void main(String[] args) {
        //O método _abs () _ retorna o valor absoluto de um determinado valor
        System.out.println("Metodo abs " + Math.abs(-23.0));

        //Calcula e retorna o valor do primeiro argumento elevado à potência do segundo
        System.out.println("Metodo pow " + Math.pow(3, 2));

        //Retorna a raiz quadrada positiva arredondada de um double
        System.out.println("Metodo sqrt " + Math.sqrt(9));

        //Da mesma forma, cbrt () _ retorna a raiz do cubo de um _double
        System.out.println("Metodo cbrt " + Math.cbrt(27));

        //Como o nome do método sugere, ele retorna o máximo entre dois valores
        System.out.println("Metodo max " + Math.max(2.3, 4));

        //Da mesma maneira, _min () _ retorna o mínimo entre dois valores
        System.out.println("Metod min " + Math.min(-1.4, -1.2));

        //Retorna um double maior que ou igual a 0,0 e menor que 1.0: pseudo-aleatoriamente
        System.out.println("Metodo random " + Math.random());

        //É útil quando precisamos conhecer o sinal do valor
        System.out.println("Metodo signum " + Math.signum(-7));

        //Aceita dois parâmetros e retorna o primeiro argumento com o sinal do segundo argumento
        System.out.println("Metodo copySign " + Math.copySign(2, -9));
    }
}
