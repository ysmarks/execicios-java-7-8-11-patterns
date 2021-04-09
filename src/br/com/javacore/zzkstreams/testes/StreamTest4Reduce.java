package br.com.javacore.zzkstreams.testes;

import br.com.javacore.zzkstreams.classes.Pessoa;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class StreamTest4Reduce {
    public static void main(String[] args) {
        Optional<Integer> soma = getStream().reduce((x, y) -> x + y);
        System.out.println(soma.get());

        Optional<Integer> soma2 = getStream().reduce(Integer::sum);
        System.out.println(soma2.get());

        Integer multiplicacao = getStream().reduce(1, (x, y) -> x * y);
        System.out.println(multiplicacao);

        Optional<Double> somaSalario = Pessoa.bancoDePessoas()
                .stream()
                .filter(pessoa -> pessoa.getSalario() > 18000)
                .map(Pessoa::getSalario)
                .reduce(Double::sum);
        System.out.println(somaSalario.get());

        double somaSalario2 = Pessoa.bancoDePessoas()
                .stream()
                .filter(pessoa -> pessoa.getSalario() <= 18000)
                .mapToDouble(Pessoa::getSalario)
                .sum();
        System.out.println(somaSalario2);

    }
    public static Stream<Integer> getStream() {
        return asList(1, 2, 3, 4, 5, 6, 7, 8).stream();
    }
}
