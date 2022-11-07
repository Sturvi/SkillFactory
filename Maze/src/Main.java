import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Maze maze = new Maze();
        maze.inputMaze();
        //printmaze(maze.maze);
        int[][] onlyMazeExitWay = new int[maze.maze.length][maze.maze[0].length];
        onlyMazeExitWay = maze.onlyMazeExitWay();
        int[][] mazeWithAllSteps = new int[maze.maze.length][maze.maze[0].length];
        mazeWithAllSteps = maze.findingAnExitFromMaze();
        printMazeExitWay (maze, onlyMazeExitWay, mazeWithAllSteps);

    }

    private static void printMazeExitWay(Maze maze, int[][] onlyMazeExitWay, int[][] mazeWithAllSteps) {
        for (int i = 0; i < maze.maze.length; i++) {
            for (int j = 0; j < maze.maze[0].length; j++) {
                if (i == maze.mazeStartY && j == maze.mazeStartX) {
                    System.out.print("\033[0;31m" + "S" + "\t" + "\033[0m");
                } else if (i == maze.mazeEndY && j == maze.mazeEndX)
                    System.out.print("\033[0;31m" + "E" + "\t" + "\033[0m");
                else if (mazeWithAllSteps[i][j]==0 && maze.maze[i][j]!=0){
                    System.out.print(maze.maze[i][j] + "\t");

                } else if (mazeWithAllSteps[i][j]!=0 && onlyMazeExitWay[i][j] ==0) {
                    System.out.print("\033[0;34m" + mazeWithAllSteps[i][j] + "\t\033[0m");
                } else if (onlyMazeExitWay[i][j]!=0) {
                    System.out.print("\033[0;31m" + mazeWithAllSteps[i][j] + "\t\033[0m");
                } else {
                    System.out.print("\033[0;35m" + mazeWithAllSteps[i][j] + "\t\033[0m");
                }
            }
            System.out.println("");
        }
    }

    private static void printmaze(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == 0)
                    System.out.print("\033[0;35m" + maze[i][j] + "\t\033[0m");
                else System.out.print(maze[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }



}

