package br.com.javacore.zztdesignpattern.prototype;

import java.util.Objects;

public class Circle extends Shape{

    public int radius;

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if (Objects.nonNull(target)) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

}
