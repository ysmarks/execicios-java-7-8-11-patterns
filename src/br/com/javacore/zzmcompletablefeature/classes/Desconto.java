package br.com.javacore.zzmcompletablefeature.classes;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Desconto {

    public enum Codigo{
        NENHUM(0), SILVER(5), GOLD(10), PLATINUM(15), ELITE(20);

        private final int porcentagem;

        Codigo(int porcentagem) {
            this.porcentagem = porcentagem;
        }

        public int getPorcentagem() {
            return porcentagem;
        }
    }

    public static String calculaDesconto(Orcamento orcamento) {
        return String.format("%s o preco original: %.2f, desconto: %d" + " preco final: %.2f",
                orcamento.getNomeLoja(),
                orcamento.getPreco(),
                orcamento.getCodigo().getPorcentagem(),
                calculo(orcamento.getPreco(), orcamento.getCodigo()));
    }

    private static double calculo(double preco, Codigo codigo) {
        delay();
        return preco * (100 - codigo.porcentagem) / 100;
    }

    private static void delay() {
        try {
            int delay = ThreadLocalRandom.current().nextInt(500, 2000);
            TimeUnit.MILLISECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
