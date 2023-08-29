public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        String name = ticTacToeGame.startGame();
        System.out.println("Game winner is: "+ name);
    }
}