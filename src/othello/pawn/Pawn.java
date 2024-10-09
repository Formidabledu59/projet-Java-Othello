package othello.pawn;


public class Pawn {
    private String color; // "black" ou "white"

    public Pawn(String color) {
        this.color = color;
    }

    // Change la couleur du pion
    public void changeColor() {
        if (this.color.equals("black")) {
            this.color = "white";
        } else {
            this.color = "black";
        }
    }

    public String getColor() {
        return this.color;
    }
}
