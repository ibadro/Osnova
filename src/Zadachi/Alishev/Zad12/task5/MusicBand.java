package Zadachi.Alishev.Zad12.task5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MusicBand {
    private String name;
    private int year;


    private List<MusicArtist> members;

    public static void transferMembers(MusicBand a, MusicBand b) { // static method
        for (MusicArtist member : a.getMembers())
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