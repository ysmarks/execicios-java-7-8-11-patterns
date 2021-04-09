package br.com.javacore.zzhlambdas.testes;

import br.com.javacore.zzhlambdas.classes.Carro;
import br.com.javacore.zzhlambdas.interfaces.CarroPredicate;

public class LambdaTest {

    public static void main(String[] args) {

        //usando classe anonima
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("preto");
            }
        };
        CarroPredicate carroPredicate1 = (Carro carro) -> carro.getCor().equals("preto");
        System.out.println(carroPredicate.test(new Carro("rosa", 2019)));
        System.out.println(carroPredicate1.test(new Carro("preto", 2019)));
        Runnable runnable = () -> System.out.println("dentro do runnable");
        new Thread(runnable).start();

    }
}
