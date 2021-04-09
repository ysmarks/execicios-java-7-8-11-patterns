package br.com.javacore.zzeconcorrencia.teste;

import java.util.concurrent.*;

public class CallableTest implements Callable<String> {

    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 8);
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + " executando...");
        }
        return "Trabalho finalizado, o numero aleatorio eh: " + count;
    }

    public static void main(String[] args) {
        CallableTest callableTest = new CallableTest();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> resultFuture = executorService.submit(callableTest);
        try {
            String s = resultFuture.get();
            System.out.println(s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
