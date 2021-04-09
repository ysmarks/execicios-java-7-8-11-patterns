package br.com.javacore.zzgcomportamentoporparametro.testes;

import br.com.javacore.zzgcomportamentoporparametro.classes.Carro;
import br.com.javacore.zzgcomportamentoporparametro.interfaces.CarroPredicate;
import br.com.javacore.zzgcomportamentoporparametro.predicate.CarrosCorPretoPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

public class CarroTest {

    private static List<Carro> filtraCorPreta(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro: carros) {
            if(carro.getCor().equals("preto"))
            result.add(carro);
        }
        return result;
    }

    public static List<Carro> filtraCarroDezAno(List<Carro> carroList) {
        List<Carro> result = new ArrayList<>();
        for(Carro carro : carroList) {
            if(carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10))
            result.add(carro);
        }
        return result;
    }

    public static List<Carro> filtrarCarro(List<Carro> carros, CarroPredicate carroPredicate) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if(carroPredicate.test(carro))
                result.add(carro);
        }
        return result;
    }

    public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if(predicate.test(t)) {
                result.add(t);
            }

        }
        return result;
    }

    public static void main(String[] args) {

        List<Carro> carroList = Arrays.asList(
                new Carro("Azul", 2017),
                new Carro("preto", 2004),
                new Carro("rosa", 2019),
                new Carro("branco", 2010));
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //System.out.println(filtraCorPreta(carroList));
        //System.out.println(filtraCarroDezAno(carroList));
        System.out.println(filtrar(integers, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }));
    }


}
