package Zadachi.Alishev.Zad12.task5;


import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать  MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя, но и возраст.
 * Соответственно, теперь под участником понимается не строка, а объект класса  MusicArtist .
 * Необходимо реализовать класс  MusicArtist и доработать класс  MusicBand(создать копию  класса) таким образом, чтобы участники были - объекты класса  MusicArtist .
 * После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
 * Методы для слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist .
 */
public class z12_5 {
    public static void main(String[] args) {


        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Z", 45));
        members1.add(new MusicArtist("b", 45));
        members1.add(new MusicArtist("c", 45));
        members1.add(new MusicArtist("d", 45));
        members1.add(new MusicArtist("r", 45));
        members1.add(new MusicArtist("g", 45));
        members1.add(new MusicArtist("aa", 45));

        MusicBand band1 = new MusicBand("bob", 2000, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("666666",34));
        members2.add(new MusicArtist("777777",34));
        members2.add(new MusicArtist("888888",34));

        MusicBand band2 = new MusicBand("ilnur", 2000, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}