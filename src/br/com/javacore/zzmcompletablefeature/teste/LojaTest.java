package br.com.javacore.zzmcompletablefeature.teste;

import br.com.javacore.zzmcompletablefeature.classes.Loja;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class LojaTest {
    public static void main(String[] args) {
        Loja americanas = new Loja();
        Loja casasBahia = new Loja();
        Loja pernambucanas = new Loja();
        Loja skala = new Loja();

        //execução sincrona
        /*long start = System.currentTimeMillis();
        System.out.println("Americanas: " + americanas.getPreco());
        System.out.println("Casas Bahia: " + casasBahia.getPreco());
        System.out.println("Pernambucanas: " + pernambucanas.getPreco());
        System.out.println("Skala: " + skala.getPreco());
        System.out.println(System.currentTimeMillis() - start + " ms");*/

        //Execução assincrona
        long start = System.currentTimeMillis();
        Future<Double> precoAsync = americanas.getPrecoAsyncTunado();
        Future<Double> precoAsync1 = casasBahia.getPrecoAsyncTunado();
        Future<Double> precoAsync2 = pernambucanas.getPrecoAsyncTunado();
        Future<Double> precoAsync3 = skala.getPrecoAsyncTunado();
        long end = System.currentTimeMillis();
        System.out.println("Tempo de invocação: " + (end - start) + " ms");
        enrolando();
        try {
            System.out.println("Americanas = " + precoAsync.get());
            System.out.println("Casas Bahia = " + precoAsync1.get());
            System.out.println("Pernambucanas = " + precoAsync2.get());
            System.out.println("Skala = " + precoAsync3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Tempo que levou para pegar o resultado: " + (System.currentTimeMillis() - start) + " ms");

    }

    private static void enrolando() {
        int soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}
