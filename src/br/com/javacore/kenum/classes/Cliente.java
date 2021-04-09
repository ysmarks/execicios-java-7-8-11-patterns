package br.com.javacore.kenum.classes;

public class Cliente {

    public enum TipoPagamento {
        APRAZO, AVISTA;
    }
    private String nome;
    private TipoCliente tipo;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", tipo=").append(tipo.getTexto());
        sb.append(", tipoPagamento=").append(tipoPagamento);
        sb.append('}');
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
