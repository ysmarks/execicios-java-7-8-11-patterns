package br.com.javacore.zzmcompletablefeature.classes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Loja {

    private String nome;

    public Loja(String nome) {
        this.nome = nome;
    }

    public Loja() {
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return calcularPreco();
    }

    public Future<Double> getPrecoAsync() {
        CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
        new Thread(() -> {
            try {
                precoFuturo.complete(calcularPreco());
            }catch (Exception e) {
                precoFuturo.completeExceptionally(e);
            }
        }).start();

        return precoFuturo;
    }

    public Future<Double> getPrecoAsyncTunado() {
        return CompletableFuture.supplyAsync(this::calcularPreco);
    }

    private double calcularPreco() {
        delay();
        //System.out.println(1/0);
        return ThreadLocalRandom.current().nextDouble() * 100;
    }

    private static void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
