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
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (i%2==0 )
            }
        }
    }




}
