import java.util.Scanner;

public class Maze {
    private static Scanner scanner = new Scanner(System.in);
    public int[][] maze;
    public int mazeStartX;
    public int mazeStartY;
    public int mazeEndX;
    public int mazeEndY;

    public void getMaze() {
        System.out.println("Хотите ли вы ввести лабиринт в ручную, или сгенирировать случайный лабиринт?");
        System.out.println("Введите Y если хотите ввести массив в ручную.");
        System.out.println("Введите N если хотите сгенерировать случайный лабиринт.");
        String mazeStatus = scanner.nextLine();
        while (!mazeStatus.equals("Y") && !mazeStatus.equals("N")) {
            System.out.println("Вы сделали неправильный вывод. Попробуйте снова.");
            System.out.println("Введите Y если хотите ввести массив в ручную.");
            System.out.println("Введите N если хотите сгенерировать случайный лабиринт.");
            mazeStatus = scanner.nextLine();
        }
        int mazeX = getMazeWidth();
        int mazeY = getMazeHeight();
        maze = new int[mazeY][mazeX];
        if (mazeStatus.equals("Y")) {
            maze = getMazeFromKeyboard(mazeX, mazeY);
            getMazeStartAndEndPoints(mazeStatus);
        } else {
            MazeGenerator mazeGenerator = new MazeGenerator(maze);
            maze = mazeGenerator.getRandomMaze();
            getMazeStartAndEndPoints(mazeStatus);
        }
    }

    public int [][] findingAnExitFromMaze() {
        MazeExitWay mazeExitWay = new MazeExitWay(maze, mazeStartX, mazeStartY, mazeEndX, mazeEndY);
        int[][] mazeExit = new int[maze.length][maze[0].length];
        mazeExit = mazeExitWay.getMazeExitWay();
    }

    private void getMazeStartAndEndPoints(String mazeStatus) {
        if (mazeStatus.equals("Y")) {
            System.out.println("Введите координаты стартовой точки по оси X");
            System.out.println("Можно вводить значения от 1 до " + maze[0].length);
            mazeStartX = scanner.nextInt() - 1;
            System.out.println("Введите координаты стартовой точки по оси Y");
            System.out.println("Можно вводить значения от 1 до " + maze.length);
            mazeStartY = scanner.nextInt() - 1;
            System.out.println("Введите координаты точки выхода из лабиринта по оси X");
            System.out.println("Можно вводить значения от 1 до " + maze[0].length);
            mazeEndX = scanner.nextInt() - 1;
            System.out.println("Введите координаты точки выхода из лабиринта по оси Y");
            System.out.println("Можно вводить значения от 1 до " + maze.length);
            mazeEndY = scanner.nextInt() - 1;
        } else {
            do {
                mazeStartX = getRandom(maze[0].length);
                mazeStartY = getRandom(maze.length);
            } while (maze[mazeStartY][mazeStartX] == 0);
            do {
                mazeEndX = getRandom(maze[0].length);
                mazeEndY = getRandom(maze.length);
            } while (maze[mazeEndY][mazeStartX] == 0);
        }
    }

    private int getRandom(int maxRandom) {
        return (int) (Math.random() * maxRandom);
    }

    private static int[][] getMazeFromKeyboard(int mazeWidth, int mazeHeight) {
        int[][] maze = new int[mazeHeight][mazeWidth];
        System.out.println("Введите лабиринт (0 - стена, 1 - тунель):");
        for (int i = 0; i < mazeWidth; i++) {
            for (int j = 0; j < mazeHeight; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        return maze;
    }

    private static int getMazeWidth() {
        System.out.println("Введите ширину лабиринта:");
        int mazeWidth = scanner.nextInt();
        return mazeWidth;
    }

    private static int getMazeHeight() {
        System.out.println("Введите высоту лабиринта:");
        int mazeHeight = scanner.nextInt();
        return mazeHeight;
    }
}
