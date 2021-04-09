package br.com.javacore.zztdesignpattern.factorymethod;

public class Triangle implements Polygon{
    @Override
    public Integer getNumbersOfSides() {
        return 3;
    }
}
