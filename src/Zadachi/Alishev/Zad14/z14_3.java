package Zadachi.Alishev.Zad14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический методList<Person> parseFileToObjList() , который считывает содержимое того же файла  people.txt, создает экземпляры класса “Человек” и возвращает список объектов. Получить данный список в методе  main() и распечатать его в консоль.В случае, если файла не существует в папке проекта, в программе необходимо
 * выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 * Пример ответа:  [{name='Mike', year=24}, {name='John', year=19},
 * {name='Anna', year=20}, {name='Miguel', year=5}]
 */
public class z14_3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());

    }

    public static List<Person> parseFileToObjList() {
        File file = new File("people.txt");
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) { // крутимся пока есть что читать
                String line = scanner.nextLine();

                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                Person currentPerson = new Person(Integer.parseInt(person[1]), person[0]);
                people.add(currentPerson);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
