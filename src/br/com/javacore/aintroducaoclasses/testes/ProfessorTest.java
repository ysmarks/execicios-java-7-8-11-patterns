package br.com.javacore.aintroducaoclasses.testes;

import br.com.javacore.aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Pardal";
        professor.idade = 25;
        professor.rg = "0000000";
        professor.cpf = "1111111111";

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
    }
}
