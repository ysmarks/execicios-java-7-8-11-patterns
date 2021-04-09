package br.com.javacore.oexception.checkedexception.testes;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        lerArquivo();
    }

    public static void criarArquivo() {
        File file = new File("Teste");
        try {
            System.out.println("Arquivo foi criado? " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo() {
        try {
            System.out.println("Conexão aberto");
            System.out.println("Processamento");
            throw new Exception();
           //System.out.println("Leitura");

        }catch (Exception e) {
            System.out.println("Exceção");
        }finally {
            System.out.println("Conexão fechada");
        }
    }
}
