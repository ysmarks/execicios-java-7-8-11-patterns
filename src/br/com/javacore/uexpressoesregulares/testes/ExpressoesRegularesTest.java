package br.com.javacore.uexpressoesregulares.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

    public static void main(String[] args) {
        // Meta caracteres
        // \d busca todos os digitos
        // \D busca tudo que não for digitos
        // \s espeço em branco \t \n \f \r
        // \S caractere que não e branco
        // \w buscar por caracteres de palavras a-z A-Z, digitos e _
        // \W buscar tudo que não for uma caractere palavra

        // Range de caractere
        // []

        //Quantificadores
        // ? zero ou uma ocorrencia
        // * zero ou mais ocorrencias
        // + uma ou mais ocorrencias
        // {n,m} n ate m ocorrencias
        // () agrupar
        // | para colocar ou
        // $ fim de linha
        // . coringa
        // ^ caractere de negação
        /*String regex = "0[xX]([0-9a-fA-F])+[\\s|$]*";
        String texto = "12 0x 0X 0xFFABC 0x10g 0x1";*/

        /*String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "fulano@hotmail.com, 102abc@gmail.com, #@!abrao@mail.com.br, teste@mail, teste@gmail.com.br";*/
       /* String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        String texto = "05/10/2010 05/5/2015 1/1/01 01/05/95";*/
        String regex = "proj([^,])*";
        String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto. foto";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
