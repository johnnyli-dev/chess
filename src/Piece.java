public class Piece {
    int id;
    String name;
    int value;
    boolean alive;
    public Piece() {
        this.id = 0;
        this.alive = false;
    }
    public Piece(String name, int id, int value) {
        this.name = name;
        this.id = id;
        this.value = value;
        this.alive = true;
    }

}