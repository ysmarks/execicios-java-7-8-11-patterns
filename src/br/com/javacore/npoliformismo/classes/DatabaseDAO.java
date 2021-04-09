package br.com.javacore.npoliformismo.classes;

public class DatabaseDAO implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Acesso ao banco de dados realizado com sucesso.");
    }
}
