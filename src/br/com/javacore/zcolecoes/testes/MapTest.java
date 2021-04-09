package br.com.javacore.zcolecoes.testes;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("meza", "mesa");
        map.put("vc", "você");
        map.put("teklado", "teclado");

        /*for (String key : map.keySet()) {
            System.out.println(key);
        }*/

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
