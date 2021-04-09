package br.com.javacore.zzmcompletablefeature.teste;

import br.com.javacore.zzmcompletablefeature.classes.Desconto;
import br.com.javacore.zzmcompletablefeature.classes.Loja;
import br.com.javacore.zzmcompletablefeature.classes.NovaLoja;
import br.com.javacore.zzmcompletablefeature.classes.Orcamento;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NovaLojaTest {

    public static void main(String[] args) {
        List<NovaLoja> lojas = NovaLoja.lojas();
        //loja.stream().forEach(l -> System.out.println(l.getPreco()));
        //acharPreco(lojas);
        final Executor executor = Executors.newFixedThreadPool(Math.min(lojas.size(), 100), r -> {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });
        //acharPrecoAsync(lojas, executor);
        CompletableFuture[] completableFutures = acharPrecoStream(lojas, executor)
                .map(f -> f.thenAccept(System.out::println))
                .toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(completableFutures).join();
    }

    private static List<String> acharPreco(List<NovaLoja> lojas) {
        System.out.println("Stream sequencial");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.stream()
                .map(NovaLoja::getPreco)
                .map(Orcamento::parse)
                .map(Desconto::calculaDesconto)
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);

        return collect;
    }

    private static List<String> acharPrecoAsync(List<NovaLoja> lojas, Executor executor) {
        System.out.println("Completable future Async");
        long start = System.currentTimeMillis();
        List<CompletableFuture<String>> completableFuture = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(loja::getPreco, executor))
                .map(future -> future.thenApply(Orcamento::parse))
                .map(future -> future.thenCompose(orcamento ->
                        CompletableFuture.supplyAsync(() -> Desconto.calculaDesconto(orcamento), executor)))
                .collect(Collectors.toList());

        List<String> collect = completableFuture.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");

        return collect;
    }

    private static Stream<CompletableFuture<String>> acharPrecoStream(List<NovaLoja> lojas, Executor executor) {
        System.out.println("Completable future Async");
        long start = System.currentTimeMillis();
        Stream<CompletableFuture<String>> completableFutureStream = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(loja::getPreco, executor))
                .map(future -> future.thenApply(Orcamento::parse))
                .map(future -> future.thenCompose(orcamento ->
                        CompletableFuture.supplyAsync(() -> Desconto.calculaDesconto(orcamento), executor)));


        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(completableFutureStream);

        return completableFutureStream;
    }
}
