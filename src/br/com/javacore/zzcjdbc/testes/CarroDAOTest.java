package br.com.javacore.zzcjdbc.testes;

import br.com.javacore.zzcjdbc.classes.Carro;
import br.com.javacore.zzcjdbc.classes.Comprador;
import br.com.javacore.zzcjdbc.db.CarroDAO;
import br.com.javacore.zzcjdbc.db.CompradorDAO;

public class CarroDAOTest {
    public static void main(String[] args) {
        Comprador comprador = CompradorDAO.selectById(1);
        Carro carro = new Carro("edf-4723", "Renault", "Logan",comprador);
        CarroDAO.save(carro);

    }
}
