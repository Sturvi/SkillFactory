public class TicTacToe {
    String[][] field = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    boolean queue = true;

    public void newGame() {
        field = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        queue = true;
    }

    public String[][] getField() {
        return field;
    }

    public String checkGame() {
        for (int i = 0; i < field.length; i++) {
            if (!field[i][0].equals("-") && field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]))
                return field[i][0];
        }
        for (int i = 0; i < field[0].length; i++) {
            if (!field[0][i].equals("-") && field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]))
                return field[0][i];
        }
        if (!field[0][0].equals("-") && field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]))
            return field[0][0];
        if (!field[0][2].equals("-") && field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0]))
            return field[0][2];
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("-"))
                    return null;
            }
        }
        return "D";
    }

    public String makeMove(int x, int y) {
        if (checkGame() != null)
            return "Game was ended";
        x -= 1;
        y -= 1;
        if (!field[x][y].equals("-"))
            return "Cell " + (x + 1) + ", " + (y + 1) + " is already occupied";
        field[x][y] = queue ? "X" : "0";
        queue = !queue;
        if (checkGame() == null) {
            return "Move completed";
        } else if (checkGame().equals("D")) {
            return "Draw";
        }
        return "Player " + checkGame() + " won";
    }
}
