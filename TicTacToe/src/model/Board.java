package model;

import java.util.ArrayList;
import java.util.List;
import com.sun.tools.javac.util.Pair;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if(board[row][column] != null) {
                    System.out.print(board[row][column].pieceType.name() + "  ");
                }else{
                    System.out.print("  ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer, Integer>> getFreeSpaceCell() {
        List<Pair<Integer,Integer>> freeSpace = new ArrayList<>();
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if(board[row][column] == null) {
                    Pair<Integer,Integer> rowColumn = new Pair<>(row,column);
                    freeSpace.add(rowColumn);
                }
            }
        }
        return freeSpace;
    }

    public boolean addPiece(PlayingPiece playingPiece,int row,int column){
        if (board[row][column] != null)
            return false;
        board[row][column] = playingPiece;
        return true;
    }
}
