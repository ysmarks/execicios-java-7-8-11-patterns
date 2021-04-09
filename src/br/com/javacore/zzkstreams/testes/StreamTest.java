package br.com.javacore.zzkstreams.testes;

import br.com.javacore.zzkstreams.classes.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    //Pegar os tres primeiros nomes das pessoas com menos de 25 anos ordenados pelo nome
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        //Exemplo usando o java 7
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        List<String> nomes = new ArrayList<>();
        for (Pessoa pessoa: pessoas) {
            if (pessoa.getIdade() < 25) {
                nomes.add(pessoa.getNome());
                if (nomes.size() >= 3) {
                    break;
                }
            }
        }
        //System.out.println(nomes);

        //Exemplo usando o java 8
        List<String> nomes2 = pessoas.stream()
                .filter(p -> p.getIdade() < 25)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .limit(3)
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        System.out.println(nomes2);

        System.out.println(pessoas.stream().distinct().filter(s -> s.getIdade() < 25).map(Pessoa::getNome).count());

        pessoas.stream().filter(s -> s.getIdade() > 25).forEach(System.out::println);

    }
}
