package br.com.javacore.npoliformismo.classes;

public class Soma extends OperacaoMatematica{

    @Override
    public double calcula(double x, double y) {
        return x + y;
    }
}
