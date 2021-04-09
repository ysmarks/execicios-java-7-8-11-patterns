package br.com.javacore.zcolecoes.testes;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("C", "Letra C");
        map.put("B", "Letra B");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.higherEntry("C"));
        System.out.println("-----------------");
        System.out.println(map.size());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.size());
    }
}
