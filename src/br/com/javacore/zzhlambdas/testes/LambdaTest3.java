package br.com.javacore.zzhlambdas.testes;

import br.com.javacore.zzhlambdas.classes.Carro;
import br.com.javacore.zzhlambdas.classes.ComparadorCarro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest3 {

    public static void main(String[] args) {
        //forEach(Arrays.asList("teste1", "teste2", "teste3"), System.out::println);
        List<Carro> carros = Arrays.asList(
                new Carro("azul", 2019),
                new Carro("rosa", 2020),
                new Carro("amarelo", 2014),
                new Carro("branco", 2016));
        //Primeiro exemplo
        Collections.sort(carros, ComparadorCarro::compararPorCor);
        System.out.println(carros);
        //Segundo exemplo
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Collections.sort(carros, comparadorCarro::compararPorAno);
        System.out.println(carros);
        //Terceiro exemplo
        List<String> nomes = Arrays.asList("Cavalo", "Vaca", "Galo", "Porco", "Cachorro");
        nomes.sort(String::compareTo);
        System.out.println(nomes);
        Function<String, Integer> stringToInterger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInterger2 = Integer::parseInt;
        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        //Quarto exemplo
        BiFunction<String, Integer, Carro> carroBiFunction = (cor, ano) -> new Carro(cor, ano);
        BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
        System.out.println(carroBiFunction.apply("azul", 2019));
        System.out.println(carroBiFunction2.apply("rosa", 2020));

        /*Predicate<Integer> par = (Integer i) -> i % 2 == 0;
        IntPredicate impar = (int i) -> i % 2 == 1;
        System.out.println(par.test(20));
        System.out.println(impar.test(21));*/
    }

    public static  <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}
