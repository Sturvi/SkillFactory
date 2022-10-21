public class MazeExitWay {
    public int[][] maze;
    public int mazeStartX;
    public int mazeStartY;
    public int mazeEndX;
    public int mazeEndY;

    public MazeExitWay(int[][] maze, int mazeStartX, int mazeStartY, int mazeEndX, int mazeEndY) {
        this.maze = maze;
        this.mazeStartX=mazeStartX;
        this.mazeStartY=mazeStartY;
        this.mazeEndX=mazeEndX;
        this.mazeEndY=mazeEndY;
    }
    public int[][] getMazeExitWay() {
        return maze;
    }
}
