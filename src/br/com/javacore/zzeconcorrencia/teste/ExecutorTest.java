package br.com.javacore.zzeconcorrencia.teste;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadTrabalhadoraExecutor implements Runnable {

    private String num;

    public ThreadTrabalhadoraExecutor(String num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " iniciou: " + num);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" finalizou");
    }
}

public class ExecutorTest {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        executorService.execute(new ThreadTrabalhadoraExecutor("1"));
        executorService.execute(new ThreadTrabalhadoraExecutor("2"));
        executorService.execute(new ThreadTrabalhadoraExecutor("3"));
        executorService.execute(new ThreadTrabalhadoraExecutor("4"));
        executorService.execute(new ThreadTrabalhadoraExecutor("5"));
        executorService.execute(new ThreadTrabalhadoraExecutor("6"));
        executorService.execute(new ThreadTrabalhadoraExecutor("7"));
        executorService.shutdown();
        while (!executorService.isTerminated()) {}
        System.out.println(executorService.isTerminated());
    }

}
