package Задачи.zad_Alishev.Zad6;
/*В классах Автомобиль и Мотоцикл реализовать два метода:
info​ () - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
yearDifference​ () - принимает на вход число (год), и возвращает разницу между
переданным годом и годом выпуска транспортного средства*/
public class Car {

    private int year;
    private String color = "red";
    private String model = "X5";

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это auto ");
    }
    public int yearDiff(int inputYear ) {
        return  Math.abs(year -inputYear);
    }
}

