package br.com.javacore.bintroducaometodos.testes;

import br.com.javacore.bintroducaometodos.classes.Professor;

public class ProfessorTest {

    public static void main(String[] args) {

        Professor prof1 = new Professor();
        prof1.nome = "Bebeto";
        prof1.matricula = "200300";
        prof1.cpf = "23456789";
        prof1.rg = "349444999";
        prof1.imprime();

        Professor prof2 = new Professor();
        prof2.nome = "Romario";
        prof2.matricula = "57585";
        prof2.cpf = "000999";
        prof2.rg = "1111111";
        prof2.imprime();
    }
}
