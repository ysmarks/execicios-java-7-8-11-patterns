package br.com.javacore.zzdthreads.classes;

import java.util.LinkedList;
import java.util.Queue;

public class ListaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private boolean aberto = true;

    public int getEmailPendentes() {
        synchronized (emails) {
            return this.emails.size();
        }
    }

    public boolean isAberto() {
        return aberto;
    }

    public String obterEmailMembro() {
        String email = null;
        try {
            synchronized (this.emails) {
                while (this.emails.size() == 0) {
                    if(!aberto) {
                        return null;
                    }
                    System.out.println("Lista vazia, colocando a thread: " + Thread.currentThread().getName()+" em modo wait");
                    this.emails.wait();
                }
                email = this.emails.poll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        return email;
    }

    public void adicionaEmailMembro(String email) {
        synchronized (this.emails) {
            this.emails.add(email);
            System.out.println("Email adicionado a lista!");
            System.out.println("Notificando as threads que estão em espera");
            this.emails.notifyAll();
        }
    }
    public void fecharLista() {
        System.out.println("Notificando todas as threads e fechando a lista");
        aberto = false;
        synchronized (this.emails) {
            this.emails.notifyAll();
        }
    }
}
