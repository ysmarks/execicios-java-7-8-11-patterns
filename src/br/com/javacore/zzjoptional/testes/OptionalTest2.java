package br.com.javacore.zzjoptional.testes;

import br.com.javacore.zzjoptional.classes.Carro;
import br.com.javacore.zzjoptional.classes.Pessoa;
import br.com.javacore.zzjoptional.classes.Seguradora;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("Sompo");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa pessoa = new Pessoa(carro, "AleTigre");
        pessoa.setIdade(18);
       // obterNomeSeguradora(Optional.ofNullable(pessoa));
        //checarNomeSeguradora(seguradora);
        //checarNomeSeguradoraOptional(seguradora);
        System.out.println(obterNomeSeguradoraComIdade(pessoa, 17));
    }

    private static void checarNomeSeguradora(Seguradora seguradora) {
        if (seguradora != null && seguradora.getNome().equals("Sompo")) {
            System.out.println("Eh a Sompo");
        }
    }

    private static void checarNomeSeguradoraOptional(Seguradora seguradora) {
        Optional<Seguradora> optional = Optional.ofNullable(seguradora);
        optional
                .filter(s -> s.getNome().equals("Sompo"))
                .ifPresent(x -> System.out.println("Eh a Sompo"));
    }

    public static String obterNomeSeguradora(Optional<Pessoa> pessoa) {
        System.out.println(pessoa
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Seguradora não existe"));
        return "";
    }

    private static String obterNomeSeguradoraComIdade(Pessoa pessoa, int idadeMinima) {
        return Optional.ofNullable(pessoa)
                .filter(p -> pessoa.getIdade() >= idadeMinima)
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora ou a idade minima não foi atingida");

    }

}
