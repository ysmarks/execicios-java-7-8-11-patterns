package br.com.javacore.eblocoinicializacao.classes;

public class Cliente {

    private int[] parcelas;

    {
        System.out.println("Dentro do bloco de inicialização");
        parcelas = new int[100];
        for (int i = 1; i < 100; i++) {
            parcelas[i - 1] = i;
        }
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
