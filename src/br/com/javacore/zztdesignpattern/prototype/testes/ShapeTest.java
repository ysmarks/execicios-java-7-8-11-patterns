package br.com.javacore.zztdesignpattern.prototype.testes;

import br.com.javacore.zztdesignpattern.prototype.Circle;
import br.com.javacore.zztdesignpattern.prototype.Rectangle;
import br.com.javacore.zztdesignpattern.prototype.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);

    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i +" Objetos diferentes");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + " São identicos");
                } else {
                    System.out.println(i + " Não são identicos");
                }
            } else {
                System.out.println("Objeto é o mesmo");
            }
        }
    }
}
