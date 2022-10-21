public class MazeGenerator {
    public int[][] maze;

    public MazeGenerator(int[][] maze) {
        this.maze = maze;
    }

    public int[][] getRandomMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    maze[i][j] = 2;
                }
            }
        }
        int currentPointX = 0;
        int currentPointY = 0;
        buldingTheMaze(currentPointX, currentPointY);
        if (maze.length % 2 == 0)
            filInTheLastColumn(maze);
        if (maze[0].length % 2 == 0)
            filInTheLastLine(maze);
        return maze;
    }

    private void filInTheLastLine(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            if (maze[i][maze[0].length - 2] == 1 || maze[Math.max(i - 1, 0)][maze[0].length - 1] == 1) {
                int random = (int) (Math.random() * 2);
                if (random == 1)
                    maze[i][maze[0].length - 1] = 1;
            }
        }
    }

    private void filInTheLastColumn(int[][] maze) {
        for (int i = 0; i < maze[0].length; i++) {
            if (maze[maze.length - 2][i] == 1 || maze[maze.length - 1][Math.max(i - 1, 0)] == 1) {
                int random = (int) (Math.random() * 2);
                if (random == 1)
                    maze[maze.length - 1][i] = 1;
            }
        }
    }

    private void buldingTheMaze(int currentPointY, int currentPointX) {
        maze[currentPointY][currentPointX] = 1;
        boolean[] unvisitedNeighbors = new boolean[4];
        do {
            for (int i = 0; i < 4; i++) {
                unvisitedNeighbors[i] = false;
            }
            getunvisitedNeighbors(unvisitedNeighbors, currentPointY, currentPointX, maze);
            int randomWay;
            if (unvisitedNeighbors[0] || unvisitedNeighbors[1] || unvisitedNeighbors[2] || unvisitedNeighbors[3])
                do {
                    randomWay = (int) (Math.random() * 4);
                    switch (randomWay) {
                        case (0):
                            if (unvisitedNeighbors[0]) {
                                maze[currentPointY - 1][currentPointX] = 1;
                                buldingTheMaze(currentPointY - 2, currentPointX);
                            }
                            break;
                        case (1):
                            if (unvisitedNeighbors[1]) {
                                maze[currentPointY + 1][currentPointX] = 1;
                                buldingTheMaze(currentPointY + 2, currentPointX);
                            }
                            break;
                        case (2):
                            if (unvisitedNeighbors[2]) {
                                maze[currentPointY][currentPointX - 1] = 1;
                                buldingTheMaze(currentPointY, currentPointX - 2);
                            }
                            break;
                        default:
                            if (unvisitedNeighbors[3]) {
                                maze[currentPointY][currentPointX + 1] = 1;
                                buldingTheMaze(currentPointY, currentPointX + 2);
                            }
                            break;
                    }
                } while (!unvisitedNeighbors[randomWay]);
        } while (unvisitedNeighbors[0] || unvisitedNeighbors[1] || unvisitedNeighbors[2] || unvisitedNeighbors[3]);
    }

    private void getunvisitedNeighbors(boolean[] unvisitedNeighbors, int currentPointX, int currentPointY, int[][] maze) {
        if (currentPointX - 2 >= 0 && maze[currentPointX - 2][currentPointY] == 2)
            unvisitedNeighbors[0] = true;
        else
            unvisitedNeighbors[0] = false;
        if (currentPointX + 2 < maze.length && maze[currentPointX + 2][currentPointY] == 2)
            unvisitedNeighbors[1] = true;
        else
            unvisitedNeighbors[1] = false;
        if (currentPointY - 2 >= 0 && maze[currentPointX][currentPointY - 2] == 2)
            unvisitedNeighbors[2] = true;
        else
            unvisitedNeighbors[2] = false;
        if (currentPointY + 2 < maze[0].length && maze[currentPointX][currentPointY + 2] == 2)
            unvisitedNeighbors[3] = true;
        else
            unvisitedNeighbors[3] = false;
    }
}



