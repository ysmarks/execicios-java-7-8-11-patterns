package br.com.javacore.yserializacao.testes;

import br.com.javacore.yserializacao.classes.Aluno;
import br.com.javacore.yserializacao.classes.Turma;

import java.io.*;

public class SerializacaoTest {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();

    }

    private static void gravadorObjeto() {
        Turma turma = new Turma("Javairos na area");
        Aluno aluno = new Aluno(1L, "teste", "teste123");
        aluno.setTurma(turma);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            outputStream.writeObject(aluno);
            System.out.println("gravado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) objectInputStream.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
