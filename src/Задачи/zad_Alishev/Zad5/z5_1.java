package Задачи.zad_Alishev.Zad5;

/**Создать класс Автомобиль (англ. ​ Car​ ), с полями “Год выпуска”, “Цвет”, “Модель”.
 Создать ​ get​и ​ set​методы для каждого поля. Создать экземпляр класса Автомобиль,
 задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 Созданный вами класс должен отвечать принципам инкапсуляции.*/
/** Создать класс Мотоцикл (англ. ​ Motorbike​ ), с полями “Год выпуска”, “Цвет”,
 “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 слово ​ this​ . Геттером получить год выпуска, цвет, модель, вывести значения в
 консоль.*/

public class z5_1 {
    public static void main(String[] args) {
         Car car = new Car();
         car.setColor("red");
         car.setYear(2000);
         car.setModel( "x5");
        Motorbike motor = new Motorbike(2000,"sd","red");

        System.out.println("Year "+car.getYear()+
                " model " + car.getModel() +
                " color " + car.getColor());
        System.out.println(motor.getModel() + "\n"+
                motor.getColor() + "\n"+
                motor.getYear());

    }

}
