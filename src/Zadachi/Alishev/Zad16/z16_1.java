package Zadachi.Alishev.Zad16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Реализовать программу, которая на вход принимает txt файл с целыми числами(можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом. В консоль необходимо вывести полнуюзапись вещественного числа (со всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).
 * Детали реализации: В классе Task1 создать публичный статический методprintResult(File file) , в котором реализовать вышеописанную логику. В методе
 * main() класса Task1 вызвать метод printResult(File file) , передав ему в качестве аргумента объект класса File ( txt файл с целыми числами).
 * Пример:
 * Числа в txt файле: 5 2 8 34 1 36 77
 * Ответ: 23.285714285714285 --> 23,286
 */
public class z16_1 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            double result = 0;
            Scanner scanner = new Scanner(file);
            String[] arr = scanner.nextLine().split(" ");
            for (String s : arr) {
                result += (double) Integer.parseInt(s);
            }
            System.out.print((double) result/arr.length+" --> ");
            System.out.printf("%.3f", (result/ arr.length));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
