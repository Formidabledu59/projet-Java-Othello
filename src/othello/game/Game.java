package othello.game;

import othello.player.Player;
import othello.pawn.Pawn;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public Game(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, "black");
        this.player2 = new Player(player2Name, "white");
        this.currentPlayer = player1; // Le joueur noir commence
        this.board = new Board();
    }

    // Affiche le plateau et le score
    public void displayGameState() {
        board.displayBoard();
    }

    // Passe au joueur suivant
    public void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    // Démarre le jeu (simple affichage du plateau pour le moment)
    public void start() {
        System.out.println("Début de la partie entre " + player1.getName() + " et " + player2.getName() + ".");
        displayGameState(); // Affiche le plateau de départ
    }
}
