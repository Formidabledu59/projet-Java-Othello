package othello.game;

public class Board {
    private String[][] board;

    public Board() {
        board = new String[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        // Initialisation du plateau avec 4 pions
        board[3][3] = "Blanc";
        board[3][4] = "Noir";
        board[4][3] = "Noir";
        board[4][4] = "Blanc";
    }

    public void display() {
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print((cell == null ? "." : cell.charAt(0)) + " ");
            }
            System.out.println();
        }
    }

    public int getBlackCount() {
        return countPawns("Noir");
    }

    public int getWhiteCount() {
        return countPawns("Blanc");
    }

    private int countPawns(String color) {
        int count = 0;
        for (String[] row : board) {
            for (String cell : row) {
                if (color.equals(cell)) {
                    count++;
                }
            }
        }
        return count;
    }
}
