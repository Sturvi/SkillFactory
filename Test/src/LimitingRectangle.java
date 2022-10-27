public class LimitingRectangle {
    public  int[][] points;
    public int widthMax;
    public int widthMin;
    public int heightMax;
    public int heightMin;

    public LimitingRectangle(int[][] points) {
        this.points = points;
        widthMax=widthMin=points[0][0];
        heightMax=heightMin=points[0][1];



    }



    public int getWidth() {
        for (int i = 1; i < points.length; i++) {
            if (points[i][0]>widthMax) widthMax=points[i][0];
            if (points[i][0]<widthMin) widthMin=points[i][0];
        }
        return widthMax-widthMin;
    }

    public int getHeight() {
        for (int i = 1; i < points.length; i++) {
            if (points[i][1]>heightMax) heightMax=points[i][1];
            if (points[i][1]<heightMin) heightMin=points[i][1];
        }
        return heightMax-heightMin;
    }

    public String getBorders() {
        return heightMin + ", " + heightMax + ", " + widthMin + ", " + widthMax;
    }
}
