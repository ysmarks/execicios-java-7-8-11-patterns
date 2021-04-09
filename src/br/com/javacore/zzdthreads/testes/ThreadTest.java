package br.com.javacore.zzdthreads.testes;

class ThreadExemplo extends Thread {
    private char c;

    public ThreadExemplo(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.print("  Executando thread: " + Thread.currentThread().getName() + " ");
        for (int i = 0; i < 100; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadRunnable implements Runnable {

    private char c;

    public ThreadRunnable(char c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println("  Executando thread: " + Thread.currentThread().getName() + " ");
        for (int i = 0; i < 100; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            //Thread.yield();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        /*ThreadExemplo t1 = new ThreadExemplo('A');
        ThreadExemplo t2 = new ThreadExemplo('E');
        ThreadExemplo t3 = new ThreadExemplo('I');
        ThreadExemplo t4 = new ThreadExemplo('O');*/
        Thread t1 = new Thread(new ThreadRunnable('A'), "T1");
        Thread t2 = new Thread(new ThreadRunnable('B'), "T2");
        Thread t3 = new Thread(new ThreadRunnable('C'), "T3");
        Thread t4 = new Thread(new ThreadRunnable('V'), "T4");
        t1.getPriority();
        t1.start();
        t1.join();
        t2.start();
        t3.start();
        t4.start();
    }
}
