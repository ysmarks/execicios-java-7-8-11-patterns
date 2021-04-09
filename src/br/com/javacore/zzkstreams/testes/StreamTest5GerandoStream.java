package br.com.javacore.zzkstreams.testes;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest5GerandoStream {
    public static void main(String[] args) {
        //Gerando stream
        IntStream.rangeClosed(1, 40).filter(i -> i % 2 == 0).forEach(s -> System.out.print(s + " "));
        System.out.println();
        IntStream.range(1, 40).filter(i -> i % 2 == 0).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Stream.of("romario", " bebeto", " mazinho", " rai", " dunga", " jorginho").map(String::toUpperCase).forEach(System.out::print);
        System.out.println();
        int nums[] = {1, 2, 3, 4, 5};
        Arrays.stream(nums).forEach(System.out::print);
        System.out.println();
        try (Stream<String> lines = Files.lines(Paths.get("teste.txt"), Charset.defaultCharset());) {
            lines.flatMap(line -> Arrays.stream(line.split("\n")))
                    .filter(p -> p.contains("File"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stream.iterate(1, n -> n + 3)
                .limit(5)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(5)
                .forEach(t -> System.out.println(Arrays.toString(t)));

        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(11)
                .map(t->t[0])
                .forEach(System.out::println);

        System.out.println("******************");
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(()-> random.nextInt(1,20)).limit(10).forEach(System.out::println);

    }
}
