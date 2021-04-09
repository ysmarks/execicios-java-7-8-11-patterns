package br.com.javacore.zzmcompletablefeature.teste;

import br.com.javacore.zzmcompletablefeature.classes.Loja;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LojaTest2 {

    public static void main(String[] args) {

        List<Loja> lojaList = Arrays.asList(
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("Pernambucanas"),
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("Pernambucanas"),
                new Loja("Americanas"),
                new Loja("Casas Bahia"),
                new Loja("Pernambucanas"),
                new Loja("Skala")
        );
        acharPreco(lojaList);
        acharPrecoStreamParalela(lojaList);
        acharPrecoCompletableFutureSequencial(lojaList);
        acharPrecoCompletableFuture(lojaList);
        final Executor executor = Executors.newFixedThreadPool(Math.min(lojaList.size(), 100), r -> {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });
        acharPrecoCompletableFutureExecutor(lojaList, executor);
    }

    private static List<String> acharPreco(List<Loja> lojas) {
        System.out.println("Stream sequencial");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.stream()
                .map(loja -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco()))
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);

        return collect;
    }

    private static List<String> acharPrecoStreamParalela(List<Loja> lojas) {
        System.out.println("Stream paralela");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.parallelStream()
                .map(loja -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco()))
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);
        return collect;

    }

    private static List<String> acharPrecoCompletableFutureSequencial(List<Loja> lojas) {
        System.out.println("Completable future sequencial");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                        () -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco())
                ))
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);
        return collect;
    }

    private static List<String> acharPrecoCompletableFuture(List<Loja> lojas) {
        System.out.println("Completable future");
        long start = System.currentTimeMillis();
        List<CompletableFuture<String>> collect = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                        () -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco())
                ))
                .collect(Collectors.toList());
        System.out.println("Tempo de invocação: " + (System.currentTimeMillis() - start) + " ms");
        List<String> collect1 = collect.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start));
        System.out.println(collect1);
        return collect1;
    }

    private static List<String> acharPrecoCompletableFutureExecutor(List<Loja> lojas, Executor executor) {
        System.out.println("Completable future Executor");
        long start = System.currentTimeMillis();
        List<CompletableFuture<String>> collect = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                        () -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco())
                ))
                .collect(Collectors.toList());
        System.out.println("Tempo de invocação: " + (System.currentTimeMillis() - start) + " ms");
        List<String> collect1 = collect.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect1);
        return collect1;
    }

}
