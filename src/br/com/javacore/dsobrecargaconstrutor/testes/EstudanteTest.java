package br.com.javacore.dsobrecargaconstrutor.testes;

import br.com.javacore.dsobrecargaconstrutor.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante = new Estudante("22222", "teste", new double[]{10,8,6});
        estudante.imprime();
    }
}
