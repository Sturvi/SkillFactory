public class Main {
    // write your code here
    public static void main(String[] args) {
<<<<<<< Updated upstream
        SeaBoard board = new SeaBoard();
        board.shoot(0, 0, "m");
        board.shoot(2, 0, "h");
        board.shoot(6, 9, "h");
        board.shoot(2, 1, "d");
        String[][] s = board.getField();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
=======
        Squirrel squirrel = new Squirrel(new int[] {1, -2, 3, 1, -1, -4, -10, 3, 4});
        System.out.println((squirrel.maxNuts()));

        var dog = new Dog();

>>>>>>> Stashed changes
    }
}