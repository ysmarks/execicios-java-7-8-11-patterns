package br.com.javacore.zzdthreads.testes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class  ListaNomes {

    private List<String> nomes = Collections.synchronizedList(new LinkedList<>());

    public void add(String nome) {
        nomes.add(nome);
    }
    public void renoverPrimeiro() {
        if (nomes.size() > 0) {
            System.out.println(nomes.remove(0));
        }
    }
}
public class ThreadSafeTest {

    public static void main(String[] args) {
        ListaNomes nomes = new ListaNomes();
        nomes.add("Tigre");
        class RemovendoDeNomes extends Thread{

            public void run() {
                nomes.renoverPrimeiro();
            }
        }
        new RemovendoDeNomes().start();
        new RemovendoDeNomes().start();
    }
}
