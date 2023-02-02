package Zadachi.Alishev.Zad12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создать класс Музыкальная Группа (англ.  MusicBand ) с полями name и  year класса  MusicBand, добавить их в список (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать  список.
 *
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после 2000 года. Вызвать метод
 * groupsAfter2000(List<MusicBand> bands)в методе  main()на вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */
public class z12_3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Test1", 2005);
        MusicBand band2 = new MusicBand("Test1assdsdd", 1000);
        MusicBand band3 = new MusicBand("Test1asdddd", 1500);
        MusicBand band4 = new MusicBand("Test1asd", 2050);
        MusicBand band5 = new MusicBand("Test1asdasd", 2005);
        MusicBand band6 = new MusicBand("Test1asdf", 1998);
        MusicBand band7 = new MusicBand("Test1asddddf", 2010);
        MusicBand band8 = new MusicBand("Test1asdffasd", 1999);
        MusicBand band9 = new MusicBand("Test1asdfasdf", 2005);
        MusicBand band10 = new MusicBand("Test1asdfasdf", 2010);

        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(band1);
        musicBandList.add(band2);
        musicBandList.add(band3);
        musicBandList.add(band4);
        musicBandList.add(band5);
        musicBandList.add(band6);
        musicBandList.add(band6);
        musicBandList.add(band7);
        musicBandList.add(band8);
        musicBandList.add(band9);
        musicBandList.add(band10);

        System.out.println(musicBandList);
        Collections.shuffle(musicBandList); // перемешать список
        System.out.println(musicBandList);

        List<MusicBand> musicBandList2000 = new ArrayList<>();
        for(MusicBand Band : musicBandList){
             if(Band.getYear() > 2000)
                 musicBandList2000.add(Band);
        }
        System.out.println(musicBandList2000);
    }

}
