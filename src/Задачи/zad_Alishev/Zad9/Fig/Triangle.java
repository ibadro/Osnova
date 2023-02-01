package Задачи.zad_Alishev.Zad9.Fig;


public class Triangle extends Figure {
    private double l1;
    private double l2;
    private double l3;


    public Triangle(String color, double l1, double l2, double l3) {
        super(color);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double area() {
        double halfp = perimeter() / 2;

        return Math.sqrt(halfp * (halfp - l1) * (halfp - l2) * (halfp - l3));// Прямоугольник
    }

    @Override
    public double perimeter() {
        return l1 + l2 + l3;
    }
}
