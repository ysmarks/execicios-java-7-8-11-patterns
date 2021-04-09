package br.com.javacore.zztdesignpattern.sigleton.testes;

import br.com.javacore.zztdesignpattern.sigleton.GerenciadorDeJanelasExemplo1;

public class GerenciadorDeJanelasExemplo1Test {
    public static void main(String[] args) {
        GerenciadorDeJanelasExemplo1 instancia = GerenciadorDeJanelasExemplo1.INSTANCIA;
        GerenciadorDeJanelasExemplo1 instancia2 = GerenciadorDeJanelasExemplo1.INSTANCIA;//Não cria o segundo objeto
    }
}
