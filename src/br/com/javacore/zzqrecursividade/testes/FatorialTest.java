package br.com.javacore.zzqrecursividade.testes;

import br.com.javacore.zzqrecursividade.classes.Fatorial;

public class FatorialTest {
    public static void main(String[] args) {
        System.out.println("Fatoral com recursão: " + new Fatorial().fibonacci(7));
        System.out.println("Fatoral com for: " + new Fatorial().fatoralUsandoFor(6));
        System.out.println("Fatoral com stream: " + new Fatorial().fatoralUsandoStream(5));
    }
}
