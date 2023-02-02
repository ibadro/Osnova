package Zadachi.Alishev.Zad6;

import java.util.Random;

/**Создать класс ​ Teacher​(Преподаватель), имеющий поля “Имя”, “Предмет”. Создать
 класс ​ Student​(Студент) с полем “Имя”.
 Каждый класс имеет конструктор (с параметрами), ​ set​и ​ get​методы по
 необходимости, а также у преподавателя есть метод ​ evaluate​(оценить студента),
 принимающий в качестве аргумента студента, и работающий следующим образом:
 внутри метода случайным образом генерируется число от 2 до 5, выводится строка:
 "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
 по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
 Все слова, написанные большими буквами, должны быть заменены
 соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”,
 "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от
 значения случайного числа.
 Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки
 студента, передав студента в качестве аргумента метода.*/
public class Teacher {
    private String fio;
    private String predmet;

    public void evaluate(Student student){
        Random random = new Random();
        int randomvalue = random.nextInt(4)+2;

        String evalueation ="";
        switch (randomvalue){
            case 2: evalueation = "Неуд";
            break;
            case 3: evalueation = "уд";
                break;
            case 4: evalueation = "Хор";
                break;
            case 5: evalueation = "Отл";
                break;
        }
        // Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА
        System.out.println("Преподаватель "+ this.fio + " оценил студента с именем " + student.getFio()+ " по предмету "+ this.predmet + " на оценку " +evalueation);
    }

    public Teacher(String fio, String predmet) {
        this.fio = fio;
        this.predmet = predmet;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}
