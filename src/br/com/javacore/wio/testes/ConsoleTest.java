package br.com.javacore.wio.testes;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        char[] chars = c.readPassword("%s", "pw");
        for (char ch : chars) {
            c.format("%c", ch);
        }
        c.format("\n");
    }
}
