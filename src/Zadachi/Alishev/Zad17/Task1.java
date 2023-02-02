package Zadachi.Alishev.Zad17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> chessPiecesList = new ArrayList<>();
        for(int i = 0; i<4;i++) chessPiecesList.add(ChessPiece.PAWN_WHITE.getSmail());
        for(int i = 0; i<4;i++) chessPiecesList.add(ChessPiece.ROOK_BLACK.getSmail());
        for(String s: chessPiecesList){
            System.out.print(s+" ");
        }

    }
}
