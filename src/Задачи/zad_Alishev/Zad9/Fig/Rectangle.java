package Задачи.zad_Alishev.Zad9.Fig;

public class Rectangle extends Figure {
    private double length;
    private double weight;

    public Rectangle(String color,double length,double weight) {
        super(color);
        this.length = length;
        this.weight = weight;
    }

    @Override
    public double area() {
        return length * weight ;
    }

    @Override
    public double perimeter() {
         return 2 * (length + weight);
    }
}

