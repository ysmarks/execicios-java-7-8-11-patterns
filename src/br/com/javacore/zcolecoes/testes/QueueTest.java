package br.com.javacore.zcolecoes.testes;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("U");
        queue.add("I");
        queue.add("A");
        queue.add("O");
        queue.add("B");
        queue.add("E");

        System.out.println(queue);

        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
