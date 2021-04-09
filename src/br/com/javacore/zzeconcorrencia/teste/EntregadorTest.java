package br.com.javacore.zzeconcorrencia.teste;


import br.com.javacore.zzeconcorrencia.clesse.Entregador;
import br.com.javacore.zzeconcorrencia.clesse.ListaMembros;

import javax.swing.*;

public class EntregadorTest {
    public static void main(String[] args) {
        ListaMembros listaMembros = new ListaMembros();
        Thread t1 = new Thread(new Entregador(listaMembros), "Entregador 1 ");
        Thread t2 = new Thread(new Entregador(listaMembros),"Entregador 2 ");
        t1.start();
        t2.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Digite o email do membro");
            if (email == null || email.isEmpty()) {
                listaMembros.fecharLista();
                break;
            }
            listaMembros.adicionaEmailMembro(email);
        }
    }
}
