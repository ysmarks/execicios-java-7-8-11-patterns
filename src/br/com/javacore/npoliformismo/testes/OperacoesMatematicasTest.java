package br.com.javacore.npoliformismo.testes;

import br.com.javacore.npoliformismo.classes.Divisao;
import br.com.javacore.npoliformismo.classes.OperacaoMatematica;
import br.com.javacore.npoliformismo.classes.Soma;

public class OperacoesMatematicasTest {

    public static void main(String[] args) {

        calculaOperacao(new Divisao(), 0, 4);
        calculaOperacao(new Soma(), 345, 5683);

    }

    public static void calculaOperacao(OperacaoMatematica o, double x, double y) {
        System.out.println(o.calcula(x, y));
    }
}
