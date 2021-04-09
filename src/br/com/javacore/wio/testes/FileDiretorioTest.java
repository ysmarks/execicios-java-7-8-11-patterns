package br.com.javacore.wio.testes;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) {
        /*File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretorio criado?" + mkdir);
        File file1 = new File("C:\\Users\\ysmarks.santos\\Downloads\\testediversos\\folder\\teste.txt");
        try {
            boolean newFile = file1.createNewFile();
            System.out.println("Arquivo criado? " + newFile);
            File arquivoRenomeado = new File(diretorio, "arquivo-renomeado.txt");
            boolean renomeado = file1.renameTo(arquivoRenomeado);
            System.out.println("Renomeado: " + renomeado);
            File diretorioRenomeado = new File("folder2");
            boolean b = diretorio.renameTo(diretorioRenomeado);
            System.out.println("Diretorio renomeado? " + b);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        buscar();
    }
    public static void buscar() {
        File file = new File("C:\\Users\\ysmarks.santos\\Downloads\\testediversos\\folder2");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
