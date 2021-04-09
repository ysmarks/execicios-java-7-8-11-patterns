package br.com.javacore.kenum.classes;

public enum TipoCliente {
    PESSOA_FISICA(1, "pessoa fisica"), PESSOA_JURIDICA(2, "pessoa juridica"){
        public String getId() {
            return "B";
        }
    };

    private int tipo;
    private String texto;

    TipoCliente(int tipo, String texto) {
        this.tipo = tipo;
        this.texto = texto;
    }

    public String getId() {
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getTexto() {
        return texto;
    }
}
