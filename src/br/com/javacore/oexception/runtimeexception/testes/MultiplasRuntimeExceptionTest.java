package br.com.javacore.oexception.runtimeexception.testes;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {

    public static void main(String[] args) {

        try {
            throw new IllegalArgumentException();
        }catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("sair do programa");
        try {
            multicatch();
        }catch (IOException | SQLException | AWTException e) {

        }
    }

    public static void multicatch() throws IOException, SQLException, AWTException {

    }
}
