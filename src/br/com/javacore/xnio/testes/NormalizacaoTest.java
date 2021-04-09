package br.com.javacore.xnio.testes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {
    public static void main(String[] args) {
        String diretorioPorjeto = "testediversos\\home\\ysmarks\\dev";
        String arquivo = "..\\..\\arquivo.txt";
        Path p1 = Paths.get(diretorioPorjeto, arquivo);
        System.out.println(p1);
        System.out.println(p1.normalize());
    }
}
