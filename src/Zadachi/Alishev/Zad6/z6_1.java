package Zadachi.Alishev.Zad6;

public class z6_1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setYear(2000);
        car.setModel("x5");
        Motorbike motor = new Motorbike(2000, "sd", "red");

        System.out.println("Year " + car.getYear() +
                " model " + car.getModel() +
                " color " + car.getColor());
        System.out.println(motor.getModel() + "\n" +
                motor.getColor() + "\n" +
                motor.getYear());
        car.info();
        motor.info();

        System.out.println(car.yearDiff(1990));
        System.out.println(motor.yearDiff(1500));

    }

}
