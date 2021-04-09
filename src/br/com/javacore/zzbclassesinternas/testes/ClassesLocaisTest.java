package br.com.javacore.zzbclassesinternas.testes;

public class ClassesLocaisTest {

    private String nome = "gato";

    public void metodoQueContemAhClasseLocal() {
        String sobreNome = " de Botas";
        class Interna {
            public void imprimeNomeCompletoExterno() {
                System.out.println(nome + sobreNome);
            }
        }
        Interna interna = new Interna();
        interna.imprimeNomeCompletoExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTest locaisTest = new ClassesLocaisTest();
        locaisTest.metodoQueContemAhClasseLocal();
    }
}
