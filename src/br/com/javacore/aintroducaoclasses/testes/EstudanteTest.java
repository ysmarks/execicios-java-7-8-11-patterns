package br.com.javacore.aintroducaoclasses.testes;

import br.com.javacore.aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Romario";
        estudante.matricula = "2345";
        estudante.idade = 20;

        System.out.println(estudante.nome);
        System.out.println(estudante.matricula);
        System.out.println(estudante.idade);
    }
}
