package br.com.javacore.wio.testes;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("teste.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {

            bw.write("Escrevendo uma mensagem no arquivo");
            bw.newLine();
            bw.write("E pulando uma linha 2");
            bw.flush();

            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
