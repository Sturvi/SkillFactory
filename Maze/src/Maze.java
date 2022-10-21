import java.util.Scanner;

public class Maze {
    private static Scanner scanner = new Scanner(System.in);
    public int[][] maze;
    public int mazeStartWidth;
    public int mazeStartHeight;
    public int mazeEndWidth;
    public int mazeEndHeight;

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
        int mazeWidth = getMazeWidth();
        int mazeHeight = getMazeHeight();
        maze = new int[mazeWidth][mazeHeight];
        if (mazeStatus.equals("Y")) {
            maze = getMazeFromKeyboard(mazeWidth, mazeHeight);
            getMazeStartAndEndPoints(mazeStatus);
        } else {
            getMazeStartAndEndPoints(mazeStatus);
            MazeGenerator mazeGenerator = new MazeGenerator(maze, mazeStartWidth, mazeStartHeight, mazeEndWidth, mazeEndHeight);
            maze = mazeGenerator.getRandomMaze();
        }
    }

    private void getMazeStartAndEndPoints(String mazeStatus) {
        if (mazeStatus.equals("Y")) {
            System.out.println("Введите координаты стартовой точки по оси X");
            System.out.println("Можно вводить значения от 1 до " + maze.length);
            mazeStartWidth = scanner.nextInt() - 1;
            System.out.println("Введите координаты стартовой точки по оси Y");
            System.out.println("Можно вводить значения от 1 до " + maze[0].length);
            mazeStartHeight = scanner.nextInt() - 1;
            System.out.println("Введите координаты точки выхода из лабиринта по оси X");
            System.out.println("Можно вводить значения от 1 до " + maze.length);
            mazeEndWidth = scanner.nextInt() - 1;
            System.out.println("Введите координаты точки выхода из лабиринта по оси Y");
            System.out.println("Можно вводить значения от 1 до " + maze[0].length);
            mazeEndHeight = scanner.nextInt() - 1;
        } else {
            mazeStartWidth = getRandom(maze.length);
            mazeStartHeight = getRandom(maze[0].length);
            mazeEndWidth = getRandom(maze.length);
            mazeEndHeight = getRandom(maze[0].length);
        }
    }

    private int getRandom(int maxRandom) {
        return (int) (Math.random()*maxRandom);
    }

    private static int[][] getMazeFromKeyboard(int mazeWidth, int mazeHeight) {
        int[][] maze = new int[mazeWidth][mazeHeight];
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
