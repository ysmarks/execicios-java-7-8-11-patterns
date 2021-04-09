package br.com.javacore.zztdesignpattern.factorymethod.testes;

import br.com.javacore.zztdesignpattern.factorymethod.PolygonFactory;

public class PolygonFactoryTest {

    public static void main(String[] args) {
        PolygonFactory factory = new PolygonFactory();
        int number = 4;

        factory.getPolygon(number);
    }
}
