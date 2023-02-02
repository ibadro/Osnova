package Zadachi.Alishev.Zad16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Реализовать программу, записывающую числа разных типов в 2 файла.
 * Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
 * Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.
 * Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
 * Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
 * Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).
 * После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file) . Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную часть.
 * Пример:Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для группы из 4 целых чисел.
 * Файл 1 : 3 8 7 5 28 73 4 1 5 32 89 12
 * Файл 2 : 5.75 26.5 34.5
 * Ответ : 66
 * Комментарии к примеру:
 * Среднее арифметическое для четверки 3 8 7 5 равно 5.75
 * Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
 * Сумма вещественных чисел из Файла 2 равняется 66.75
 * Отбросив вещественную часть (числа после запятой) получаем ответ 66 .
 */
public class z16_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random rand = new Random();

        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1); // auto create file

        for (int i = 0; i < 1000; i++)
            pw1.println(rand.nextInt(100));

        pw1.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2); // auto create
        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if (counter == 20) {
                pw2.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }
        }
        pw2.close();

        Scanner scanner2 = new Scanner(file2);

        double result = 0;
        while (scanner2.hasNextLine())
            result += Double.parseDouble(scanner2.nextLine());

        System.out.println((int) result);

    }

}
