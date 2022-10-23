import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Maze maze = new Maze();
        maze.getMaze();
        for (int i = 0; i < maze.maze.length; i++) {
            for (int j = 0; j < maze.maze[0].length; j++) {
                System.out.print(maze.maze[i][j] + " ");
            }
            System.out.println("");
        }
        int[][] mazeExit = new int[maze.maze.length][maze.maze[0].length];
        mazeExit = maze.onlyMazeExitWay();
        for (int i = 0; i < maze.maze.length; i++) {
            for (int j = 0; j < maze.maze[0].length; j++) {
                if (i == maze.mazeStartY && j == maze.mazeStartX) {
                    System.out.print("\033[0;31m" + "S" + "\t\t" + "\033[0m");
                } else if (i == maze.mazeEndY && j == maze.mazeEndX)
                    System.out.print("\033[0;31m" + "E" + "\t\t" + "\033[0m");
                else {
                    System.out.print(mazeExit[i][j] + "\t\t");
                }
            }
            System.out.println("");
        }
    }

}

