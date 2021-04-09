package br.com.javacore.zzkstreams.testes;

import br.com.javacore.zzkstreams.classes.Genero;
import br.com.javacore.zzkstreams.classes.Maioridade;
import br.com.javacore.zzkstreams.classes.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest6Collector2 {
    //Agrupamento
    public static void main(String[] args) {

        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        //Como era feito no Java 7
        Map<Genero, List<Pessoa>> generoListMap = new HashMap<>();
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getGenero().equals(Genero.FEMININO)) {
                femininos.add(pessoa);
            } else {
                masculinos.add(pessoa);
            }
        }
        generoListMap.put(Genero.FEMININO, femininos);
        generoListMap.put(Genero.MASCULINO, masculinos);
        //System.out.println(generoListMap);

        //Usando o Java 8 é apenas uma linha para agrupar por genero
        Map<Genero, List<Pessoa>> collect = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero));
        //System.out.println(collect);

        //Agrupar por maioridade
        Map<Maioridade, List<Pessoa>> collect1 = pessoas.stream().collect(Collectors.groupingBy(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }));
        //System.out.println(collect1);
        //Agrupando por genero e maioridade
        Map<Genero, Map<Maioridade, List<Pessoa>>> collect2 = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.groupingBy(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        })));
        //System.out.println(collect2);
        //Agrupando or genero e quantidade
        Map<Genero, Long> collect3 = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.counting()));
        //System.out.println(collect3);
        //Agrupando por genero e maior salario
        Map<Genero, Pessoa> collect4 = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getGenero, Collectors
                        .collectingAndThen(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)), Optional::get)));
       // System.out.println(collect4);
        // Agrupando por genero e estatistica
        Map<Genero, DoubleSummaryStatistics> collect5 = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.summarizingDouble(Pessoa::getSalario)));
        //System.out.println(collect5);
        //Agrupando por genero e maioridade com set
        Map<Genero, Set<Maioridade>> collect6 = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.mapping(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }, Collectors.toSet())));
        System.out.println(collect6);

    }
}
