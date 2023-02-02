package Zadachi.Alishev.Zad6;

//В классах Автомобиль и Мотоцикл реализовать два метода:
//        info​ () - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//        yearDifference​ () - принимает на вход число (год), и возвращает разницу между
//        переданным годом и годом выпуска транспортного средства
public class Motorbike {
    private int year;
    private String color = "red";
    private String model = "X5";

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void info() {
        System.out.println("Это bike");
    }
    public int yearDiff(int inputYear ) {
        return  Math.abs(year -inputYear);
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
