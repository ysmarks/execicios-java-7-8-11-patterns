package br.com.javacore.zzcjdbc.crud;

import br.com.javacore.zzcjdbc.classes.Carro;
import br.com.javacore.zzcjdbc.classes.Comprador;
import br.com.javacore.zzcjdbc.db.CarroDAO;

import java.util.List;
import java.util.Scanner;

public class CarroCRUD {

    private static Scanner teclado = new Scanner(System.in);

    public static void executar(int op) {
        switch (op) {
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite um nome: ");
                buscarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;
        }
    }

    public static void atualizar() {
        System.out.println("Selecione um dos carroes abaixo: ");
        List<Carro> carroList = listar();
        Carro carro = carroList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Nova placa ou enter para manter a mesma");
        String placa = teclado.nextLine();
        System.out.println("Nova marca ou enter para manter a mesma");
        String marca = teclado.nextLine();
        System.out.println("Novo modelo ou enter para manter o mesmo");
        String modelo = teclado.nextLine();
        if (!placa.isEmpty()) {
            carro.setPlaca(placa);
        }
        if (!marca.isEmpty()) {
            carro.setMarca(marca);
        }
        if (!modelo.isEmpty()) {
            carro.setModelo(modelo);
        }
        CarroDAO.update(carro);
    }

    public static List<Carro> listar() {
        List<Carro> carroList = CarroDAO.selectAll();
        for (int i = 0; i < carroList.size(); i++) {
            Carro carro = carroList.get(i);
            System.out.println("[" + i + "]" + carro.getPlaca() + " " + carro.getMarca() + " " + carro.getModelo());
        }
        return carroList;
    }

    public static void buscarPorNome(String nome) {
        List<Carro> carroList = CarroDAO.selectByName(nome);
        for (int i = 0; i < carroList.size(); i++) {
            Carro carro = carroList.get(i);
            System.out.println("[" + i + "]" + carro.getPlaca() + " " + carro.getMarca() + " " + carro.getModelo());
        }
    }

    public static void inserir() {
        Carro carro = new Carro();
        System.out.println("Placa:");
        carro.setPlaca(teclado.nextLine());
        System.out.println("Marca: ");
        carro.setMarca(teclado.nextLine());
        System.out.println("Modelo: ");
        carro.setModelo(teclado.nextLine());
        List<Comprador> compradorList = CompradorCRUD.listar();
        carro.setComprador(compradorList.get(Integer.parseInt(teclado.nextLine())));
        CarroDAO.save(carro);
    }

    public static void deletar() {
        System.out.println("Selecione um dos carroes abaixo para deletar:");
        List<Carro> carroList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza? s/n");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            CarroDAO.delete(carroList.get(index));
        }
    }
}
