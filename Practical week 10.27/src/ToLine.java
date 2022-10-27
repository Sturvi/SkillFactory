public class ToLine {
    int data[][];

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize(){
        int[] resizeArray=new int[data.length*data[0].length];
        int k=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                resizeArray[k]=data[i][j];
                k++;
            }
        }
        return resizeArray;
    }
}
