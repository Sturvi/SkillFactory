public class MazeGenerator {
    private static int mazeWidth;
    private static int mazeHeight;

    public MazeGenerator(int mazeHeight, int mazeWidth) {
        this.mazeWidth=mazeWidth;
        this.mazeHeight=mazeHeight;
    }

    public int[][] getRandomMaze (){
        System.out.println("Находится на стадии разработки");
        int[][] randomMaze = new int[mazeWidth][mazeWidth];
        return randomMaze;
    }

}
