package br.com.javacore.oexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploDivisaoExceptionTest {

    private static int calculaQuociente(int numerador, int denominador) {
        return numerador / denominador;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        do {

            try {
                System.out.println("Numerado: ");
                int numerado = scanner.nextInt();

                System.out.println("Denominador: ");
                int denominador = scanner.nextInt();

                int resultado = calculaQuociente(numerado, denominador);
                System.out.println("Resultado: " + resultado);

                continua = false;

            }catch (ArithmeticException e) {
                System.err.println("O número divisor deve ser diferente de 0");
            }catch (InputMismatchException e) {
                System.err.println("Não é permitido inserir letras, informe numeros inteirose");
                scanner.nextLine();
            }
            finally {
                System.out.println("Executa o bloco dentro do finally");
            }

        }while (continua);
    }
}
