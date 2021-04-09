package br.com.javacore.zztdesignpattern.builder;

public class Telefone {

    private int ddd;
    private int numero;
    private TipoFone tipoFone;

    public Telefone(int ddd, int numero, TipoFone tipoFone) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipoFone = tipoFone;
    }

    public Telefone() {
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "ddd=" + ddd +
                ", numero=" + numero +
                ", tipoFone=" + tipoFone +
                '}';
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoFone getTipoFone() {
        return tipoFone;
    }

    public void setTipoFone(TipoFone tipoFone) {
        this.tipoFone = tipoFone;
    }

    public enum TipoFone {

        RESIDENCIAL,
        CELULAR,
        COMERCIAL
    }
}
