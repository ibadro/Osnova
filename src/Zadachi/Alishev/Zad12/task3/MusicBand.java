package Zadachi.Alishev.Zad12.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Создать класс Музыкальная Группа (англ.  MusicBand ) с полями name и  year
 * класса  MusicBand, добавить их в список (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 * список. Создать статический метод в классе  Task3 : public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после 2000 года. Вызвать метод
 * groupsAfter2000(List<MusicBand> bands)в методе  main()на вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MusicBand {
    private String name;
    private int year;


}