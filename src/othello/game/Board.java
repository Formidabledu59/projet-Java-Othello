package othello.game;


public class Board {
    private Pawn[][] board;

    public Board() {
        // Initialise le plateau 8x8 avec des cases vides
        board = new Pawn[8][8];
        initializeBoard();
    }

    // Initialisation du plateau avec les 4 pions au centre
    private void initializeBoard() {
        board[3][3] = new Pawn("white");
        board[3][4] = new Pawn("black");
        board[4][3] = new Pawn("black");
        board[4][4] = new Pawn("white");
    }

    // Affiche le plateau
    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(board[i][j].getColor().charAt(0) + " ");
                }
            }
            System.out.println();
        }
    }
}
