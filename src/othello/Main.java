import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des noms des joueurs
        System.out.println("Entrez le nom du joueur 1 (Noir) : ");
        String player1Name = scanner.nextLine();

        System.out.println("Entrez le nom du joueur 2 (Blanc) : ");
        String player2Name = scanner.nextLine();

        // Création du jeu avec les deux joueurs
        Game game = new Game(player1Name, player2Name);

        // Démarre la partie
        game.start();
    }
}
