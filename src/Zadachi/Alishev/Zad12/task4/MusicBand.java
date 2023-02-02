package Zadachi.Alishev.Zad12.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Создать класс Музыкальная Группа (англ.  MusicBand ) с полями name и  year
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public static void transferMembers(MusicBand a, MusicBand b) { // static method
        for (String member : a.getMembers())
            b.getMembers().add(member);
        a.getMembers().clear();
    }

//    public void transfer(MusicBand a, MusicBand b) { // Nonstatic method
//        for (String member : this.members)
//            b.getMembers().add(member);
//        this.getMembers().clear();
//    }
    public void printMembers() {
        System.out.println(this.members);
    }
}