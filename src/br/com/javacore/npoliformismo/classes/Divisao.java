package br.com.javacore.npoliformismo.classes;

public class Divisao extends OperacaoMatematica{

    @Override
    public double calcula(double x, double y) {
        if(x == 0) {
            return 0;
        }
        return x / y;
    }
}
