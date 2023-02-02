package Zadachi.Alishev.Zad12;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 * консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 * из списка. Распечатать список.
 */
public class z12_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");

        System.out.println(list);
        list.set(3, "bmv");
        list.remove(0);
        System.out.println(list);

    }
}
