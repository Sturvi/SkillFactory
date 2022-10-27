public class Main {
    // write your code here
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        System.out.println(ticTacToe.makeMove(1, 1));
        System.out.println(ticTacToe.makeMove(1, 1));
        System.out.println(ticTacToe.makeMove(1, 2));
        System.out.println(ticTacToe.makeMove(2, 1));
        System.out.println(ticTacToe.makeMove(2, 2));
        System.out.println(ticTacToe.makeMove(1, 3));
        System.out.println(ticTacToe.makeMove(3, 2));
ticTacToe.newGame();
        System.out.println(ticTacToe.makeMove(1, 1));
    }
}