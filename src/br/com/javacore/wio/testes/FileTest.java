package br.com.javacore.wio.testes;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("aquivo.txt");
        try {
            boolean newFile = file.createNewFile();
            boolean exists = file.exists();
            System.out.println("Leitura? " + file.canRead());
            System.out.println("Path absoluto: " + file.getAbsolutePath());
            System.out.println("Diretorio? " + file.isDirectory());
            if (exists) {
                System.out.println("Deletado? " + file.delete());
            }
            // System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
