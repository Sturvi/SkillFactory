public class MazeExitWay {
    private int[][] maze;
    private int mazeStartX;
    private int mazeStartY;
    private int mazeEndX;
    private int mazeEndY;
    private boolean exitFound=false;


    public MazeExitWay(int[][] maze, int mazeStartX, int mazeStartY, int mazeEndX, int mazeEndY) {
        this.maze = maze;
        this.mazeStartX = mazeStartX;
        this.mazeStartY = mazeStartY;
        this.mazeEndX = mazeEndX;
        this.mazeEndY = mazeEndY;
    }

    public int[][] mazeExitWay() {
        int[][] maze2 = new int[maze.length][maze[0].length];
        int stepCounter=1;
        takeTheNextStep(maze2, mazeStartX, mazeStartY, stepCounter);
        return maze2;


    }

    private void takeTheNextStep(int[][] maze2, int currentX, int currentY, int stepCounter) {
        maze2[currentY][currentX]=stepCounter;
        stepCounter++;
        exitFound =maze2[mazeEndY][mazeEndX]>1?true:false;
        if (!exitFound &&
                currentY>0 &&
                maze[currentY-1][currentX]==1 &&
                maze2[currentY-1][currentX]==0){
            stepCounter=maze2[currentY][currentX]+1;
            takeTheNextStep(maze2,currentX,currentY-1,stepCounter);
        }
        if (!exitFound &&
                currentX<maze[0].length-1 &&
                maze[currentY][currentX+1]==1 &&
                maze2[currentY][currentX+1]==0){
            stepCounter=maze2[currentY][currentX]+1;
            takeTheNextStep(maze2,currentX+1,currentY,stepCounter);
        }
        if (!exitFound &&
                currentY<maze.length-1 &&
                maze[currentY+1][currentX]==1 &&
                maze2[currentY+1][currentX]==0){
            stepCounter=maze2[currentY][currentX]+1;

            takeTheNextStep(maze2,currentX,currentY+1,stepCounter);
        }
        if (!exitFound &&
                currentX>0 &&
                maze[currentY][currentX-1]==1 &&
                maze2[currentY][currentX-1]==0){
            stepCounter=maze2[currentY][currentX]+1;
            takeTheNextStep(maze2,currentX-1,currentY,stepCounter);
        }
    }
}