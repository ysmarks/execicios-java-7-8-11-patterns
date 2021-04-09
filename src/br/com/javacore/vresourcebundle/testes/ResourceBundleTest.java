package br.com.javacore.vresourcebundle.testes;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    public static void main(String[] args) {
        //System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("titulo"));
        System.out.println(bundle.getString("mensagem"));
        System.out.println(bundle.getString("show"));
        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println("-----------------");
        System.out.println(bundle.getString("titulo"));
        System.out.println(bundle.getString("mensagem"));
        System.out.println(bundle.getString("show"));
    }
}
