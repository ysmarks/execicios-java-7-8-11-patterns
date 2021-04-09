package br.com.javacore.sstrings.testes;

/**
 * Converte a String em um vetor de byte[]. Este método é muito útil principalmente
 * quando precisamos salvar caracteres no banco desconsiderando a codificação atual
 */
public class StringMethodGetBytesTest {

    public static void main(String[] args) {
        String texto = "Pernambuco";
        for(byte b : texto.getBytes()) {
            System.out.println(b);
        }
    }
}
