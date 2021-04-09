package br.com.javacore.zzeconcorrencia.teste;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("I", lock)).start();
        new Thread(new Worker("O", lock)).start();
        new Thread(new Worker("U", lock)).start();
    }

    static class Worker implements Runnable {

        private String nome;
        private ReentrantLock reentrantLock;

        public Worker(String nome, ReentrantLock reentrantLock) {
            this.nome = nome;
            this.reentrantLock = reentrantLock;
        }

        @Override
        public void run() {
            reentrantLock.lock();
            try {
                if(reentrantLock.isHeldByCurrentThread()) {
                    System.out.printf("Thread %s entrou em modo critico %n", nome);
                }
                System.out.printf("%d Thread esperando na fila %n", reentrantLock.getQueueLength());
                System.out.printf("Thread %s vai trabalhar por 2 segundos %n", nome);
                Thread.sleep(2000);
                System.out.printf("Thread %s finalizou o trabalho %n", nome);

            }catch (InterruptedException e) {

            }finally {
                reentrantLock.unlock();
            }
        }
    }
}
