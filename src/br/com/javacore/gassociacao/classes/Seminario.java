package br.com.javacore.gassociacao.classes;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("----------------Relatorio seminario----------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Alunos participantes: ");
        if (alunos != null && alunos.length > 0) {
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome() + " ");
            }
        }else {
            System.out.println("Nenhum aluno participando");
        }
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Endeço, " + local.getRua() + " Bairro: " + local.getBairro());

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
