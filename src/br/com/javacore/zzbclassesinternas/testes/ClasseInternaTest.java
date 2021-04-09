package br.com.javacore.zzbclassesinternas.testes;

public class ClasseInternaTest {

    private String nome = "Alertigre";

    protected class Interna {

        public void verClasseExterna() {
            System.out.println(nome);//exibir nome da classe externa
            System.out.println(this); //exibir classe interna
            System.out.println(ClasseInternaTest.this);//exibir classe externa
        }

    }
    public static void main(String[] args) {

        //Primeira forma de obter uma classe interna
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.verNomeExterno();

        //Segunda forma de obter classe interna
        ClasseInternaTest.Interna interna1 = new ClasseInternaTest().new Interna();
        interna1.verClasseExterna();

    }
}

class Externa {

    private String nome = "Teste";

    class Interna {
        public void verNomeExterno() {
            System.out.println(nome);
        }
    }
}
