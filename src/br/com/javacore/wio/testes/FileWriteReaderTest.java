package br.com.javacore.wio.testes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReaderTest {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");
        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file);) {

            fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha 2");
            fw.flush();
            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho: " + size);
            for (char i : in) {
                System.out.print(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
