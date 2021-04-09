package br.com.javacore.oexception.customexception.testes;

import br.com.javacore.oexception.customexception.classes.LoginInvalidoException;

public class CustomExceptionTest {

    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    public static void logar() throws LoginInvalidoException {
        String usuarioBanco = "teste";
        String senhaBanco = "123";
        String usuarioDigitado = "teste";
        String senhaDigitada = "111";

        if(!usuarioBanco.equals(usuarioDigitado) || !senhaBanco.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        }else {
            System.out.println("Logado");
        }
    }
}
