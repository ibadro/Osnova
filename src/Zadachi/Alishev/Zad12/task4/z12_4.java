package Zadachi.Alishev.Zad12.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать  MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и удалять участников. Под участником понимается строка ( String ) с именем и фамилией.
 * Реализовать метод слияния групп (в классе  MusicBand ), т.е. все участники группы  А переходят в группу  B.
 * Название метода:  transferMembers. Этот метод принимает в качестве аргументов два экземпляра класса MusicBand. Реализовать метод  printMembers(в классе  MusicBand ), выводящий список участников в консоль. Проверить состав групп после слияния.
 */
public class z12_4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("11111");
        members1.add("22222");
        members1.add("333333");
        members1.add("444444");
        members1.add("555555");
        MusicBand band1 = new MusicBand("bob", 2000, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("666666");
        members2.add("777777");
        members2.add("888888");
        members2.add("999999");
        MusicBand band2 = new MusicBand("ilnur", 2000, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
