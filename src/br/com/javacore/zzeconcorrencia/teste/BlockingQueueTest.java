package br.com.javacore.zzeconcorrencia.teste;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        //SynchrobousQueue
        //DelayQueue
        Thread t1 = new Thread(new RemoverFromQueue(bq));
        bq.put("Teste");
        System.out.println(bq.peek());
        System.out.println("Tentando colocar outro valor");
        t1.start();
        bq.put("Teste 2");
        System.out.println("Inserido o último valor");
    }
    static class RemoverFromQueue implements Runnable {

        private BlockingQueue<String> bq;

        public RemoverFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" entrando em espera por 4s");
            try {
                TimeUnit.SECONDS.sleep(4);
                System.out.println("Removendo valor : "+bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
