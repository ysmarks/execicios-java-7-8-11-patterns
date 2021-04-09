package br.com.javacore.zzdthreads.testes;

import br.com.javacore.zzdthreads.classes.Conta;

public class ContaTest implements Runnable {

    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread ysmarks = new Thread(contaTest, "Ysmarks");
        Thread kelly = new Thread(contaTest, "Kelly");
        ysmarks.start();
        kelly.start();
    }

    private synchronized void saque(int valor) {
        if (conta.getSaldo() >= valor) {
            System.out.println(Thread.currentThread().getName() + " Está indo sacar");
            conta.saque(valor);
            System.out.println(Thread.currentThread().getName() + " Completou o saque, saldo:" + conta.getSaldo());
        } else {
            System.out.println(" Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("Ta liso");
            }
        }
    }
}
