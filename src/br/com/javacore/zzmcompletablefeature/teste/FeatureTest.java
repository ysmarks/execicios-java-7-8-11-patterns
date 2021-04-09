package br.com.javacore.zzmcompletablefeature.teste;

import java.util.concurrent.*;

public class FeatureTest {
    
   private static ExecutorService executorService = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {

        Future<Double> feature = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 2000D;
        });
        enrolando();
        try {
            Double resultado = feature.get(2, TimeUnit.SECONDS);
            System.out.println(resultado);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

    }

    private static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma =+ i;
        }
        System.out.println("Soma: " + soma);
    }
}
