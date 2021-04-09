package br.com.javacore.zzcjdbc.crud;

import br.com.javacore.zzcjdbc.classes.Comprador;
import br.com.javacore.zzcjdbc.db.CompradorDAO;

import java.util.List;
import java.util.Scanner;

public class CompradorCRUD {

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
        System.out.println("Selecione um dos compradores abaixo: ");
        List<Comprador> compradorList = listar();
        Comprador comprador = compradorList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou enter para manter o mesmo");
        String nome = teclado.nextLine();
        System.out.println("Novo cpf ou enter para manter o mesmo");
        String cpf = teclado.nextLine();
        if (!nome.isEmpty()) {
            comprador.setNome(nome);
        }
        if (!cpf.isEmpty()) {
            comprador.setCpf(cpf);
        }
        CompradorDAO.atualizar(comprador);
    }

    public static List<Comprador> listar() {
        List<Comprador> compradorList = CompradorDAO.selectAll();
        for (int i = 0; i < compradorList.size(); i++) {
            Comprador comprador = compradorList.get(i);
            System.out.println("[" + i + "]" + comprador.getNome() + " " + comprador.getCpf());
        }
        return compradorList;
    }

    public static void buscarPorNome(String nome) {
        List<Comprador> compradorList = CompradorDAO.selectByName(nome);
        for (int i = 0; i < compradorList.size(); i++) {
            Comprador comprador = compradorList.get(i);
            System.out.println("[" + i + "]" + comprador.getNome() + " " + comprador.getCpf());
        }
    }

    public static void inserir() {
        Comprador comprador = new Comprador();
        System.out.println("Nome:");
        comprador.setNome(teclado.nextLine());
        System.out.println("CPF: ");
        comprador.setCpf(teclado.nextLine());
        CompradorDAO.save(comprador);
    }

    public static void deletar() {
        System.out.println("Selecione um dos compradores abaixo para deletar:");
        List<Comprador> compradorList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza? s/n");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            CompradorDAO.delete(compradorList.get(index));
        }
    }
}
