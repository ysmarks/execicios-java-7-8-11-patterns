package br.com.javacore.zztdesignpattern.sigleton;

public class GerenciadorDeJanelasExemplo1 {
    
    public static final GerenciadorDeJanelasExemplo1 INSTANCIA = new GerenciadorDeJanelasExemplo1();
    
    private GerenciadorDeJanelasExemplo1() {
        System.out.println("DENTRO DO CONSTRUTOR");
    }
    {
        System.out.println("BLOCO DE INICIALIZAÇÃO");
    }

    private Object readResolve() {
        return INSTANCIA;
    }
}
