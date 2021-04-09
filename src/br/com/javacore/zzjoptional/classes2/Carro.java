package br.com.javacore.zzjoptional.classes2;

public class Carro {

    private Seguradora seguradora;
    private String nome;

    public Seguradora getSeguradora() {
        return seguradora;
    }

    public String getNomeSeguradora(Pessoa pessoa) {
        if (pessoa != null) {
            Carro carro = pessoa.getCarro();
            if (carro != null) {
                Seguradora seguradora = carro.getSeguradora();
                if (seguradora != null) {
                    return seguradora.getNome();
                }
            }
        }
        return "";
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
