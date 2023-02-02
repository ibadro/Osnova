package Zadachi.Alishev.Zad17;

public enum ChessPiece {
    KING_BLACK(100,"♚"), KING_WHITE(100,"♔"),
    QUEEN_BLACK(9,"♛"), QUEEN_WHITE(9,"♕"),
    ROOK_BLACK(5,"♜"), ROOK_WHITE(5,"♖"),
    BISHOP_BLACK(3.5,"♝"), BISHOP_WHITE(3.5,"♗"),
    KNIGHT_BLACK(3,"♞"), KNIGHT_WHITE(3,"♘"),
    PAWN_BLACK(1,"♟"), PAWN_WHITE(1,"♙"),
    EMPTY(-1,"_");


    private double value;
    private String smail;

    ChessPiece(double value, String smail) {
        this.value = value;
        this.smail = smail;
    }

    public double getValue() {
        return value;
    }

    public String getSmail() {
        return smail;
    }
}
