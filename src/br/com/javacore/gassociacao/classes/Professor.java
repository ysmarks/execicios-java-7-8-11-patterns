package br.com.javacore.gassociacao.classes;

public class Professor {

    private String nome;
    private  String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("-----------Relatorio Professor-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Seminarios apresentados");
        if (seminarios != null && seminarios.length > 0) {
            for (Seminario seminario : seminarios) {
                System.out.println(seminario.getTitulo());
            }
        }else {
            System.out.println("Nenhum seminario apresentado");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
