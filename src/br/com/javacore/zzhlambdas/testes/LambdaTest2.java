package br.com.javacore.zzhlambdas.testes;

import br.com.javacore.zzhlambdas.classes.Carro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class LambdaTest2 {

    public static void main(String[] args) {

        //forEach(Arrays.asList("teste1", "teste2", "teste3"), (String s) -> System.out.println(s));
        List<Integer> map = map(asList("Romario", "Bebeo", "Rai", "Dunga"), (String s) -> s.length());
        List<Carro> carros = Arrays.asList(
                new Carro("azul", 2019),
                new Carro("Rosa", 2020),
                new Carro("amarelo", 2014),
                new Carro("branco", 2016));
        List<String> corList = map(carros, (Carro c) -> c.getCor());
        System.out.println(corList);
        Predicate<Integer> numerosPares = (Integer i) -> i % 2 == 0;
        IntPredicate numerosImpares = i -> i % 2 == 1;
        Predicate<String> cor = s -> corList.add(s);
        cor.test("roxo");
        System.out.println(corList);
        Consumer<String> cor1 = s -> corList.add(s);
        cor1.accept("lilas");
        System.out.println(corList);
        //System.out.println(numerosPares.test(10));
        //System.out.println(numerosImpares.test(10));

        //System.out.println(map);
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
