package br.com.javacore.zzeconcorrencia.teste;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private Map<String, String> map = new HashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
    }

    public Object[] allKeys() {
        return map.keySet().toArray();
    }
}

public class MapReadWriteLockTest {

    private final static MapReadWrite readWriteLock = new MapReadWrite();
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Write(), "A");
        Thread t2 = new Thread(new ReadA(), "B");
        Thread t3 = new Thread(new ReadB(), "C");
        t1.start();
        t2.start();
        t3.start();
    }

    static class Write implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                lock.writeLock().lock();
                try {
                    readWriteLock.put(String.valueOf(i), String.valueOf(i));
                } finally {
                    lock.writeLock().unlock();
                }
            }
        }
    }

    static class ReadA implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.readLock().lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " " + Arrays.toString(readWriteLock.allKeys()));
                } finally {
                    lock.readLock().unlock();
                }
            }
        }
    }

    static class ReadB implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.readLock().lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " " + Arrays.toString(readWriteLock.allKeys()));
                } finally {
                    lock.readLock().unlock();
                }
            }
        }
    }
}
