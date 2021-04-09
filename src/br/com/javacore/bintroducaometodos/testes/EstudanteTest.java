package br.com.javacore.bintroducaometodos.testes;

import br.com.javacore.bintroducaometodos.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Tigre");
        estudante.setIdade(21);
        double[] notas = {10,10,10};
        estudante.setNotas(notas);

        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getNotas());
    }
}
