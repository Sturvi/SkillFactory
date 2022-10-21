import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Maze maze = new Maze();
        maze.getMaze();
        for (int i = 0; i < maze.maze.length; i++) {
            for (int j = 0; j < maze.maze[0].length; j++) {
                System.out.print(maze.maze[i][j]+" ");
            }
            System.out.println("");
        }




    }



}