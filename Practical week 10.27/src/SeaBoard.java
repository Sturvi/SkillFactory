public class SeaBoard {
    private String [][] field;
    private boolean fieldTest [][] = new   boolean[10][10];

    public SeaBoard() {
        field = new String[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j]=".";
            }
        }
    }

    public String check (int line, int column){
        if (line>=0 && line<10 && column>=0 && column<10)
            return field[line][column];
        return null;
    }

    public void shoot(int line, int column, String issue){
        switch (issue){
            case ("m"):
                field[line][column]="#";
                break;
            case ("h"):
                field[line][column]="x";
                break;
            case ("d"):
                field[line][column]="x";
                destroyMark(line, column);


        }
    }

    public String[][] getField() {
        return field;
    }

    private void destroyMark (int line, int column){
        fieldTest[line][column] = true;
        for (int i = line-1; i < line+2; i++) {
            for (int j = column-1; j < column+2; j++) {
                if (check(i, j)!= null && check(i, j).equals("."))
                    field [i][j]="#";
                else if (check(i, j)!= null && check(i,j).equals("x") && !fieldTest[i][j]) {
                    fieldTest[line][column] = true;
                    destroyMark(i, j);
                }
            }
        }
    }
}
