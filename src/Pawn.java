import java.util.ArrayList;

public class Pawn extends Piece {
    boolean starting;
    int location;
    public Pawn(int location) {
        this.name = "Pawn";
        this.id = 1;
        this.value = 1;
        this.alive = true;
        this.starting = true;
        this.location = location;
    }

    public ArrayList<Integer> possibleMoves() {
        ArrayList<Integer> possibles = new ArrayList<Integer>();
        if (this.starting) {
            possibles.add(location + 16);
        }
        possibles.add(location + 8);
        return possibles;
    }
}