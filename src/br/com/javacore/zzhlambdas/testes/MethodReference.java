package br.com.javacore.zzhlambdas.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {

        forEach(Arrays.asList("Pedro", "Thiago", "João"), System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for(T t : list) {
            consumer.accept(t);
        }
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for(T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }
}
