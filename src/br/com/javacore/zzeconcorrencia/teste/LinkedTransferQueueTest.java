package br.com.javacore.zzeconcorrencia.teste;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Teste"));
        tq.put("Onca");
        System.out.println(tq.offer("Tigre"));
        System.out.println(tq.offer("Tigre", 4, TimeUnit.SECONDS));
        System.out.println(tq.tryTransfer("Corvo"));
        System.out.println(tq.tryTransfer("Corvo", 5, TimeUnit.SECONDS));
        System.out.println(tq.remainingCapacity());
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.take());
    }
}
