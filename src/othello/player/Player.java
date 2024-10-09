public class Player {
    private String name;
    private String color; // "black" ou "white"

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }
}
