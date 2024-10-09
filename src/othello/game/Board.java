package othello.game;

import java.util.concurrent.locks.Condition;
import othello.player.Player;

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

    //check------------------------------------------------------------------------------------------------------------------------------
    private boolean checkLeftRight(int row, int col, Player player) {
        // Vérifie si un mouvement horizontal de gauche |vers| droite encadre des pions adverses.

        // if (Condition) {
        //...    
        // }
        return false;
    }

    private boolean checkRightLeft(int row, int col, Player player) {
        // Vérifie si un mouvement horizontal de droite |vers| gauche encadre des pions adverses.

        // if (Condition) {
        //...    
        // }
        return false;
    }

    private boolean checkUpDown(int row, int col, Player player) {
        // Vérifie si un mouvement vertical de haut |vers| bas encadre des pions adverses.

        // if (Condition) {
        //...    
        // }
        return false;
    }

    private boolean checkDownUp(int row, int col, Player player) {
        // Vérifie si un mouvement vertical de bas |vers| haut encadre des pions adverses.

        // if (Condition) {
        //...    
        // }
        return false;
    }

    private boolean checkDiagonalUpLeftDownRight(int row, int col, Player player) {
        // Vérifie si un mouvement diagonal de haut à gauche |vers| bas à droite encadre des pions adverses.

        // if (Condition) {
        //...    
        // }
        return false;
    }

    private boolean checkDiagonalUpRightDownLeft(int row, int col, Player player) {
        // Vérifie si un mouvement diagonal de haut à droite |vers| bas à gauche encadre des pions adverses.

        // if (Condition) {
        //...    
        // }
        return false;
    }

    private boolean checkDiagonalDownLeftUpRight(int row, int col, Player player) {
        // Vérifie si un mouvement diagonal de bas à gauche |vers| haut à droite encadre des pions adverses.

        // if (Condition) {
        //...    
        // }
        return false;
    }

    private boolean checkDiagonalDownRightUpLeft(int row, int col, Player player) {
        // Vérifie si un mouvement diagonal de bas à droite |vers| haut à gauche encadre des pions adverses.

        // if (Condition) {
        //...    
        // }
        return false;
    }
    //-----------------------------------------------------------------------------------------------------------------------------------

    //getter
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
