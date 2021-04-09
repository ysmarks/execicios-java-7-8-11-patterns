package br.com.javacore.zzoagendador.testes;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class multiplosDeTresEhCincoTest {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number) {

        int three = 3;
        int five = 5;
        IntStream stream = IntStream.range(1, number);
        return stream.filter(x -> x % three == 0 || x % five == 0).distinct().sum();

    }
}
