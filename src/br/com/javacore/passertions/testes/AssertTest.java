package br.com.javacore.passertions.testes;

public class AssertTest {

    public static void main(String[] args) {
        calculaSalario(-100);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0);
    }
}
