package br.com.javacore.zzdthreads.classes;

public class Entregador implements Runnable {
    private ListaMembros listaMembros;

    public Entregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + " Começando o trabalho de entrega ");
        int qtdPedente = listaMembros.getEmailPendentes();
        boolean aberta = listaMembros.isAberto();
        while (aberta || qtdPedente > 0) {
            try {
                String email = listaMembros.obterEmailMembro();
                if (email != null) {
                    System.out.println(nomeThread + "Enviando email para " + email);
                    Thread.sleep(2000);
                    System.out.println("Envio para " + email + " concluido com sucesso ");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            aberta = listaMembros.isAberto();
            qtdPedente = listaMembros.getEmailPendentes();
        }
        System.out.println("Atividades Finalizadas");
    }
}
