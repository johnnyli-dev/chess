public class King extends Piece {
    public boolean inCheck;
    public King() {
        this.name = "King";
        this.id = 6;
        this.value = 0;
        this.alive = true;
        this.inCheck = false;
    }
}