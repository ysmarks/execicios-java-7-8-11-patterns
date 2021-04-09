package br.com.javacore.zzcjdbc.testes;

import br.com.javacore.zzcjdbc.classes.Comprador;
import br.com.javacore.zzcjdbc.crud.CarroCRUD;
import br.com.javacore.zzcjdbc.crud.CompradorCRUD;
import br.com.javacore.zzcjdbc.db.CompradorDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCRUD {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        /*Comprador comprador = new Comprador("264.868.583-35", "Bode");
        CompradorDAO.save(comprador);*/
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if (op == 0) {
                System.out.println("Sair do sistema");
                break;
            }
            if (op == 1) {
                menuComprador();
                op = Integer.parseInt(teclado.nextLine());
                CompradorCRUD.executar(op);
            }
            if (op == 2) {
                menuCarro();
                op = Integer.parseInt(teclado.nextLine());
                CarroCRUD.executar(op);
            }


        }
    }

    private static void menu() {
        System.out.println("Selecione uma opção: ");
        System.out.println("1. Comprador ");
        System.out.println("2. Carro ");
        System.out.println("0. Sair ");
    }

    public static void menuCarro() {
        System.out.println("Digite a opção para comecar");
        System.out.println("1. Inserir carro");
        System.out.println("2. Atualizar carro");
        System.out.println("3. Listar todos os carros");
        System.out.println("4. Buscar carro por nome");
        System.out.println("5. Deletar carro");
        System.out.println("0. Sair");
    }

    public static void menuComprador() {
        System.out.println("Digite a opção para comecar");
        System.out.println("1. Inserir comprador");
        System.out.println("2. Atualizar comprador");
        System.out.println("3. Listar todos os compradores");
        System.out.println("4. Buscar comprador por nome");
        System.out.println("5. Deletar comprador");
        System.out.println("0. Sair");
    }


}
