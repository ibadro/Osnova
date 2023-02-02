package Zadachi.Alishev.Zad9.Fig;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private double radius;
    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

}
