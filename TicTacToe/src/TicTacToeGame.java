import com.sun.tools.javac.util.Pair;
import model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame(){
        initializeGame();
    }
    private void initializeGame(){
        players = new LinkedList<>();
        PlayingPiece crossPiece = new PlayingPieceX();
        PlayingPiece noughtPiece = new PlayingPieceO();
        Player player1 = new Player("Player1",crossPiece);
        Player player2 = new Player("Player2",noughtPiece);
        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);
    }
    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();
            List<Pair<Integer,Integer>> freeSpaces = gameBoard.getFreeSpaceCell();
            if (freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }
            System.out.println("Player : " + playerTurn.getName() + " Enter row and column: ");
            Scanner sc = new Scanner(System.in);
            String nextLine = sc.nextLine();
            String[] values = nextLine.split(",");
            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);
            boolean pieceAdded = gameBoard.addPiece(playerTurn.playingPiece, row,column);
            if (!pieceAdded){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.add(playerTurn);
            boolean winner = checkWinner(row,column,playerTurn.playingPiece.pieceType);
            if (winner){
                return playerTurn.name;
            }
        }
        return "tie";
    }

    private boolean checkWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
                break;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
                break;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}
