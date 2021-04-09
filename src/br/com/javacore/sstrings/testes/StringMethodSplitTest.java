package br.com.javacore.sstrings.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * O método split cria um array de Strings com base no “regex” passado via parâmetro, ou seja, ele divide
 * a String em várias outras Strings com base no seu regex, o que é muito útil para separar tags em uma
 * String completa, ex: “software, engenharia, computação”. Você pode transformar essa única String em um
 * array com três Strings.
 *
 * Este método também possui uma variação, que é o parâmetro “int limit”, onde você identifica quantas vezes
 * o regex será aplicado em toda String.
 */
public class StringMethodSplitTest {

    public static void main(String[] args) {
        String textoTeste = "São Paulo";
        String texto = "Bahia,Sergipe,Mato Grosso";
        List<String> result = new ArrayList<>();
        String[] split = texto.split(",");
       for (String s : split) {
           if(s.contains(textoTeste)) {
               System.out.println(s);
           }

       }



        String texto2 = "Bazuca - Pistola - Canhão - Bomba - Metralhadora - Fuzil";
        String[] split1 = texto2.split("-", 3);
        for(String s : split1) {
            //System.out.println(s);
        }
    }
}
