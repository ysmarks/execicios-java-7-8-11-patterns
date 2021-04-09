package br.com.javacore.sstrings.testes;

public class PerformanceStringTest {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        tempoString(500);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo string: " + (fim - inicio) + " ms");

         inicio = System.currentTimeMillis();
        tempoStringBuilder(20000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo stringBuilder: " + (fim - inicio) + " ms");

         inicio = System.currentTimeMillis();
        tempoStringBuffer(20000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo stringBuffer: " + (fim - inicio) + " ms");
    }

    public static void tempoString(int tam) {
        String string = "";
        for (int i = 0; i < tam; i++) {
            string += i;
        }
    }

    public static void tempoStringBuilder(int tam) {
        StringBuilder builder = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            builder.append(i);
        }
    }

    public static void tempoStringBuffer(int tam) {
        StringBuffer builder = new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            builder.append(i);
        }
    }
}
