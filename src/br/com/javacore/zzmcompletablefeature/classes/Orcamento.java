package br.com.javacore.zzmcompletablefeature.classes;

public class Orcamento {
    private final String nomeLoja;
    private final double preco;
    private final Desconto.Codigo codigo;

    public Orcamento(String nomeLoja, double preco, Desconto.Codigo codigo) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.codigo = codigo;
    }

    public static Orcamento parse(String s) {
        String[] split = s.split(":");
        String nomeLoja = split[0];
        String precoString = split[1];
        double preco = Double.parseDouble(precoString.replace(",", "."));
        Desconto.Codigo codigo = Desconto.Codigo.valueOf(split[2]);

        return new Orcamento(nomeLoja, preco, codigo);
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public double getPreco() {
        return preco;
    }

    public Desconto.Codigo getCodigo() {
        return codigo;
    }
}
