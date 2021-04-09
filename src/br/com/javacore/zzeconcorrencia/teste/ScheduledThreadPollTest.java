package br.com.javacore.zzeconcorrencia.teste;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPollTest {

    private static final ScheduledExecutorService SERVICE = Executors.newScheduledThreadPool(1);

    private static void beep() {
        final Runnable beeper = new Runnable() {
            @Override
            public void run() {
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + " beep");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //SERVICE.scheduleAtFixedRate(beeper, 1, 5, TimeUnit.SECONDS);
        SERVICE.scheduleWithFixedDelay(beeper,1, 5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        beep();
    }
}
