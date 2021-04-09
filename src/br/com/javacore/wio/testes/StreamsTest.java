package br.com.javacore.wio.testes;

import java.io.*;

public class StreamsTest {
    public static void main(String[] args) {
        leitorTunado();
    }

    private static void gravador() {
        byte[] dados = {65, 66, 67, 68, 69, 70, 1, 101};
        try (FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")) {
            gravador.write(dados);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
        }
    }

    private static void gravadorTunado() {
        byte[] dados = {15, 20, 25, 30, 35, 40, 45, 50};
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"), 4098)) {
            outputStream.write(dados);
            outputStream.flush();
            System.out.println("Dados tunados gravados com sucesso!");

        } catch (IOException e) {

        }
    }

    private static void leitor() {
        int leitura;
        try (FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {
            while ((leitura = leitor.read()) != -1) {
                byte b = (byte) leitura;
                System.out.println(b);
            }
        } catch (IOException e) {

        }
    }

    private static void leitorTunado() {
        int leitura;
        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("pasta/stream.txt"))) {
            while ((leitura = inputStream.read()) != -1) {
                byte b = (byte) leitura;
                System.out.println(b);
            }
        }catch (IOException e) {

        }
    }
}
