package othello.game;

import othello.player.Player;
import othello.pawn.Pawn;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game() {
        this.board = new Board();
        this.player1 = new Player("Joueur 1", new Pawn("Noir"));
        this.player2 = new Player("Joueur 2", new Pawn("Blanc"));
        this.currentPlayer = player1;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans Othello!");
        System.out.print("Entrez le nom du Joueur 1 : ");
        player1.setName(scanner.nextLine());
        System.out.print("Entrez le nom du Joueur 2 : ");
        player2.setName(scanner.nextLine());
        displayBoard();
    }

    private void displayBoard() {
        board.display();
        System.out.println("Pions noirs : " + board.getBlackCount());
        System.out.println("Pions blancs : " + board.getWhiteCount());
    }
}
