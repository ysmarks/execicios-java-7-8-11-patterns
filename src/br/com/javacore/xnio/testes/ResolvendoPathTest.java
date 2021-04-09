package br.com.javacore.xnio.testes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("home\\ysmarks");
        Path arquivo = Paths.get("dev\\arquivo.txt");
        Path result = p1.resolve(arquivo);
        System.out.println(result);

        Path absoluto = Paths.get("/home/ysmarks");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1: " + absoluto.resolve(relativo));
        System.out.println("2: " + absoluto.resolve(file));
        System.out.println("3: " + relativo.resolve(absoluto));
        System.out.println("4: " + relativo.resolve(file));
        System.out.println("5: " + file.resolve(absoluto));
        System.out.println("6: " + file.resolve(relativo));
    }
}
