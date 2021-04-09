package br.com.javacore.oexception.checkedexception.testes;

import br.com.javacore.oexception.checkedexception.classes.Leitor1;
import br.com.javacore.oexception.checkedexception.classes.Leitor2;
import br.com.javacore.oexception.checkedexception.classes.Leitor3;

import java.io.*;

public class TryWithResourcesTest {

    public static void main(String[] args) {
        casoDeUsoTryWithResources();
    }

    public static void casoDeUsoTryWithResources() {
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2();
            Leitor3 leitor3 = new Leitor3()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void comoEhFeitoNoJava7() {
        try(Reader reader = new BufferedReader(new FileReader("Teste.txt"))) {
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void comoEraFeitoNoJava6() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
