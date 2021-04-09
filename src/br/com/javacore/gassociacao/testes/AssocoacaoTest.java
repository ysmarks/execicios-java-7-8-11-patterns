package br.com.javacore.gassociacao.testes;

import br.com.javacore.gassociacao.classes.Aluno;
import br.com.javacore.gassociacao.classes.Local;
import br.com.javacore.gassociacao.classes.Professor;
import br.com.javacore.gassociacao.classes.Seminario;

public class AssocoacaoTest {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("bebeto", 54);
        Aluno aluno2 = new Aluno("Romario", 53);

        Seminario seminario = new Seminario("Programação java");
        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        Professor professor = new Professor("Zico", "Futebolista");
        professor.setSeminarios(new Seminario[]{seminario});

        Local local = new Local("Rua Guaicurus", "Ponta Grossa");
        Aluno[] aluno = {aluno1, aluno2};
        seminario.setAlunos(aluno);
        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.print();
        professor.print();
        local.print();
        aluno1.print();
    }
}
