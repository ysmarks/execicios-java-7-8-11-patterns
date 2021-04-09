package br.com.javacore.zztdesignpattern.factorymethod;

import java.util.Optional;

public class PolygonFactory {

    public  Polygon getPolygon(int numberOfSides) {
        if(numberOfSides == 3) {
            System.out.println("Triangulo");
            return new Triangle();
        }
        if(numberOfSides == 4) {
            System.out.println("Quadrado");
            return new Square();
        }
        if(numberOfSides == 5) {
            System.out.println("Pentagono");
            return new Pentagon();
        }
        return null;
    }
}
