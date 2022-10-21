public class MazeGenerator {
    public int[][] maze;
    private int mazeStartWidth;
    private int mazeStartHeight;
    private int mazeEndWidth;
    private int mazeEndHeight;
    private boolean dead=false;

    public MazeGenerator(int[][] maze, int mazeStartWidth, int mazeStartHeight, int mazeEndWidth, int mazeEndHeight) {
        this.maze = maze;
        this.mazeStartWidth = mazeStartWidth;
        this.mazeStartHeight = mazeStartHeight;
        this.mazeEndWidth = mazeEndWidth;
        this.mazeEndHeight = mazeEndHeight;
    }

    public int[][] getRandomMaze() {
        System.out.println("Находится на стадии разработки");
        maze[mazeStartWidth][mazeStartHeight] = 1;
        maze[mazeEndWidth][mazeEndHeight] = 1;
        pavingTheWay(mazeStartWidth, mazeStartHeight);
        return maze;
    }

    private void pavingTheWay(int correntPointX, int correntPointY) {

        if (dead)
            return;
        int randomWay = (int) (Math.random() * 4);
        switch (randomWay) {
            case (0):

                if (correntPointX - 1<0) {
                    boolean deadlockTest = getDeadlockTest(correntPointX - 1, correntPointY);
                    if (!deadlockTest || maze[correntPointX - 1][correntPointY] == 1) {
                        pavingTheWay(correntPointX, correntPointY);
                    } else {
                        maze[correntPointX - 1][correntPointY] = 1;
                        pavingTheWay(correntPointX - 1, correntPointY);
                    }
                }
                else  pavingTheWay(correntPointX, correntPointY);
                break;
            case (1):
                if (correntPointX + 1!=maze.length) {
                    boolean deadlockTest = getDeadlockTest(correntPointX + 1, correntPointY);
                    if (!deadlockTest || maze[correntPointX + 1][correntPointY] == 1) {
                        pavingTheWay(correntPointX, correntPointY);
                    } else {
                        maze[correntPointX + 1][correntPointY] = 1;
                        pavingTheWay(correntPointX + 1, correntPointY);
                    }
                }else  pavingTheWay(correntPointX, correntPointY);
                break;
            case (2):
                if (correntPointY + 1!=maze[0].length) {
                    boolean deadlockTest = getDeadlockTest(correntPointX, correntPointY + 1);
                    if (!deadlockTest || maze[correntPointX][correntPointY + 1] == 1) {
                        pavingTheWay(correntPointX, correntPointY);
                    } else {
                        maze[correntPointX][correntPointY + 1] = 1;
                        pavingTheWay(correntPointX, correntPointY + 1);
                    }
                }else  pavingTheWay(correntPointX, correntPointY);
                break;
            case (3):
                if (correntPointY - 1<0) {
                    boolean deadlockTest = getDeadlockTest(correntPointX, correntPointY - 1);
                    if (!deadlockTest || maze[correntPointX][correntPointY - 1] == 1) {
                        pavingTheWay(correntPointX, correntPointY);
                    } else {
                        maze[correntPointX][correntPointY - 1] = 1;
                        pavingTheWay(correntPointX, correntPointY - 1);
                    }
                }else  pavingTheWay(correntPointX, correntPointY);
                break;



        }
    }

    private boolean getDeadlockTest(int correntPointX, int correntPointY) {
        if (maze[correntPointX - 1<0?correntPointX:correntPointX - 1][correntPointY] == 1 &&
                maze[correntPointX + 1==maze.length?correntPointX:correntPointX+1][correntPointY] == 1 &&
                maze[correntPointX][correntPointY - 1<0?correntPointY:correntPointY - 1] == 1 &&
                maze[correntPointX][correntPointY + 1==maze[0].length?correntPointY:correntPointY+1] == 1)
            return false;
        return true;
    }

    private boolean getDeadTest(int correntPointX, int correntPointY) {
        if (((correntPointX - 1<0?correntPointX:correntPointX - 1) == mazeEndWidth && correntPointY == mazeEndHeight) ||
                ((correntPointX + 1==maze.length?correntPointX:correntPointX+1) == mazeEndHeight  && correntPointY == mazeEndHeight) ||
                (correntPointX == mazeEndWidth && (correntPointY - 1<0?correntPointY:correntPointY - 1) == mazeEndHeight) ||
                (correntPointX == mazeEndWidth && (correntPointY + 1==maze[0].length?correntPointY:correntPointY+1) == mazeEndHeight))
            return true;
        return false;
    }


}
