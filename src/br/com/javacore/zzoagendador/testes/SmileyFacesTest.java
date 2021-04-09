package br.com.javacore.zzoagendador.testes;

import java.util.ArrayList;
import java.util.List;

public class SmileyFacesTest {

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":D");
        a.add("X-}");
        a.add("xo)");
        a.add(":X");
        a.add(":-3");
        a.add(":3");
        System.out.println(smileFaces(a));
    }

    public static int smileFaces(List<String> arr) {

      return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }
}
