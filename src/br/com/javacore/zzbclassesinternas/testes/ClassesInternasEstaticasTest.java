package br.com.javacore.zzbclassesinternas.testes;

public class ClassesInternasEstaticasTest {
    public static void main(String[] args) {
        Externa2.Interna interna = new Externa2.Interna();
        interna.imprime();

        System.out.println("-----------------");

        Interna interna1 = new Interna();
        interna1.imprime();
    }

    static class Interna {
        public void imprime() {
            System.out.println("Oi tunado");
        }
    }
}
class Externa2 {
    static class Interna {
        public void imprime() {
            System.out.println("Oi");
        }
    }

}
