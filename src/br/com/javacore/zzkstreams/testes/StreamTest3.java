package br.com.javacore.zzkstreams.testes;

import br.com.javacore.zzkstreams.classes.Pessoa;

import java.util.List;

public class StreamTest3 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().anyMatch(pessoa -> pessoa.getSalario() > 56000));
        System.out.println(pessoas.stream().allMatch(pessoa -> pessoa.getSalario() > 56000));
        System.out.println(pessoas.stream().noneMatch(pessoa -> pessoa.getSalario() > 120090));

        pessoas.stream().filter(pessoa -> pessoa.getIdade() > 25).findAny().ifPresent(pessoa -> System.out.println(pessoa.getNome()));
        pessoas.stream().filter(pessoa -> pessoa.getIdade() > 25).findFirst().ifPresent(pessoa -> System.out.println(pessoa.getNome()));
    }
}
