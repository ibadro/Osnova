package Zadachi.Alishev.Zad14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать в папке проекта файл  people.txt в котором хранятся имена и возраст людей.
 * Реализовать статический метод List<String> parseFileToStringList() , который считывает содержимое этого файла и возвращает список, состоящий из значений имен и возрастов каждого человека.
 * Получить данный список в методе  main()и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
 * Помимо этого, если значение возраста отрицательно, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 * Пример ответа:  [Mike 24, John 19, Anna 20, Miguel 5]
 * Пример содержания файла people.txt:
 * Mike 24
 * John 19
 * Anna 20
 * Miguel 5
 */
public class z14_2 {
    public static void main(String[] args) {
        System.out.println( parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        //File file = new File("C:\\Java_proj\\Osnova\\src\\people.txt");
         File file = new File("people.txt");
        List<String> people = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) { // крутимся пока есть что читать
                String line = scanner.nextLine();

                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();

                people.add(line);
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