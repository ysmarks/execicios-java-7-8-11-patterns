package br.com.javacore.oexception.customexception.classes;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Login do usuario invalido");
    }
}
