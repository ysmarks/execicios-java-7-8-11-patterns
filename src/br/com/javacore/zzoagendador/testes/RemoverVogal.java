package br.com.javacore.zzoagendador.testes;

import java.text.Normalizer;
import java.util.stream.Collectors;

/**
 * Trolls estão atacando sua seção de comentários!
 *
 * Uma forma comum de lidar com essa situação é remover todas as vogais dos comentários dos trolls, neutralizando a ameaça.
 *
 * Sua tarefa é escrever uma função que pegue uma string e retorne uma nova string com todas as vogais removidas.
 *
 * Por exemplo, a string "Este site é para perdedores LOL!" se tornaria "Ths wbst s fr lsrs LL!".
 *
 * Nota: para este kata y não é considerado uma vogal.
 */
public class RemoverVogal {
    public static void main(String[] args) {

        System.out.println(vogal("para este kata y não é considerado uma vogal"));

    }

    public static String vogal(String texto) {
        String volgais = "aeiouAEIOU";
        return texto.chars()
                .filter(c -> volgais.indexOf(c) == -1)
                .mapToObj(c -> "" +(char) c)
                .collect(Collectors.joining(""));
    }
}
