package br.com.javacore.zzjoptional.classes;

import java.util.Optional;

public class Carro {
    private Seguradora carro;
    private String nome;

    public Carro(Seguradora carro, String nome) {
        this.carro = carro;
        this.nome = nome;
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carro{");
        sb.append("carro=").append(carro);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Optional<Seguradora> getSeguradora() {
        return Optional.ofNullable(carro);
    }

    public void setSeguradora(Seguradora carro) {
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
