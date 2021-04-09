package br.com.javacore.npoliformismo.classes;

public class FileDAO implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Arquivo acessado com sucesso.");
    }
}
