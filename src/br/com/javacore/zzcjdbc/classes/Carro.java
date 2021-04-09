package br.com.javacore.zzcjdbc.classes;

import java.util.Objects;

public class Carro {

    private Integer id;
    private String placa;
    private String marca;
    private String modelo;
    private Comprador comprador;

    public Carro() {
    }

    public Carro(String placa, String marca, String modelo, Comprador comprador) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.comprador = comprador;
    }

    public Carro(Integer id, String placa, String marca, String modelo, Comprador comprador) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carro{");
        sb.append("id=").append(id);
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", comprador=").append(comprador);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(id, carro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }
}
