package br.com.javacore.zzkstreams.testes;

import br.com.javacore.zzkstreams.classes.Pessoa;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest6Collectors1 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();

        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(Collectors.counting()));

        Optional<Pessoa> max = pessoas.stream().max(Comparator.comparing(Pessoa::getSalario));
        System.out.println(max.get().getSalario());
        Optional<Pessoa> max2 = pessoas.stream().collect(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)));
        System.out.println(max2.get().getSalario());

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
        DoubleSummaryStatistics collect = pessoas.stream().collect(Collectors.summarizingDouble(Pessoa::getSalario));
        System.out.println(collect);

        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(Collectors.joining(",")));

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average());
        System.out.println(pessoas.stream().collect(Collectors.averagingDouble(Pessoa::getSalario)));
    }
}
