package br.com.javacore.npoliformismo.testes;

import br.com.javacore.npoliformismo.classes.DatabaseDAO;
import br.com.javacore.npoliformismo.classes.FileDAO;
import br.com.javacore.npoliformismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO dao = new FileDAO();
        GenericDAO dao1 = new DatabaseDAO();

        dao.save();
        System.out.println("**********************");
        dao1.save();
    }
}
