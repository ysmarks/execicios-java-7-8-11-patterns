package br.com.javacore.zzkstreams.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StreamTest2 {
    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>();
        nomes.add(asList("Bebeto", "Romario"));
        nomes.add(asList("Ronaldo", "Rivaldo"));
        System.out.println(nomes);
        List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("***************************");

        List<String> palavras = asList("ola", "oi");
        String[] split = palavras.get(1).split("");
        System.out.println(Arrays.toString(split));
        //usando o flatmap e o map
        List<String> collect1 = palavras
                .stream()
                .map(p -> p.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
