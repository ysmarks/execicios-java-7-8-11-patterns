package br.com.javacore.zzeconcorrencia.clesse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ListaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private boolean aberto = true;
    private ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public int getEmailPendentes() {
        lock.lock();
        try {
            return this.emails.size();
        } finally {
            lock.unlock();
        }
    }

    public boolean isAberto() {
        return aberto;
    }

    public String obterEmailMembro() {
        String email = null;
        try {
            lock.lock();
            while (this.emails.size() == 0) {
                if (!aberto) {
                    return null;
                }
                System.out.println("Lista vazia, colocando a thread: " + Thread.currentThread().getName() + " em modo wait");
                condition.await();
            }
            email = this.emails.poll();
        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            lock.unlock();
        }
        return email;
    }

    public void adicionaEmailMembro(String email) {
        lock.lock();
        try {
            this.emails.add(email);
            System.out.println("Email adicionado a lista!");
            System.out.println("Notificando as threads que estão em espera");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void fecharLista() {
        System.out.println("Notificando todas as threads e fechando a lista");
        aberto = false;
        lock.lock();
        try {
            this.emails.notifyAll();
        } finally {
            lock.unlock();
        }
    }
}
