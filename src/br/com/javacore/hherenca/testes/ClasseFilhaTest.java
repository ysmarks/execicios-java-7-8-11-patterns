package br.com.javacore.hherenca.testes;

import br.com.javacore.hherenca.classes.ClasseFilha;
import br.com.javacore.hherenca.classes.ClassePai;

public class ClasseFilhaTest {
    public static void main(String[] args) {
        ClasseFilha filha = new ClasseFilha();
        filha.setNome("Tigre");
        filha.setCpf("758.687.567-64");
        filha.setRg("5464637");
        filha.test();
    }
}
