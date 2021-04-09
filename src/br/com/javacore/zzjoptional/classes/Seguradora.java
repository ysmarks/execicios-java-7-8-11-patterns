package br.com.javacore.zzjoptional.classes;

import java.util.Optional;

public class Seguradora {
    private String nome;

    public Seguradora(String nome) {
        this.nome = nome;
    }

    public Seguradora() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Seguradora{");
        sb.append("nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
