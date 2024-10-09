package othello.player;

import othello.pawn.Pawn;

public class Player {
    private String name;
    private Pawn pawn;

    public Player(String name, Pawn pawn) {
        this.name = name;
        this.pawn = pawn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pawn getPawn() {
        return pawn;
    }
}
