package Zadachi.Alishev.Zad17;

public class ChessBoard {

    private ChessPiece[][] board;
    ChessBoard(ChessPiece[][] board){
        this.board=board;
    }

    public void print(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j].getSmail());
            }
            System.out.println();
        }

    }

}
