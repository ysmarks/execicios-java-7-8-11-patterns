package br.com.javacore.fmodificadorestetico.classes;

public class Cliente {

    private static int[] parcelas;

    static {

        System.out.println("Bloco de inicialização estatico");

        parcelas = new int[100];
        for (int i = 1; i < 100; i++) {
            parcelas[i -1] = i;
        }
    }

    {
        System.out.println("Bloco de inicialização não estatico");
    }

    public Cliente() {
        System.out.println("Dentro do construtor");
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
