import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import static java.lang.Integer.parseInt;

public class Board {
    Piece[][] board;
    public Board() {
        this.board = new Piece[8][8];
        for (int i =  0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = new Piece();
            }
        }
    }

    public void placePiece(Piece p, int pos) {
        this.board[pos / 8][pos % 8] = p;
    }

    public static int changeCord(String cord) {
        String alpha = cord.substring(0,1).toLowerCase(Locale.ROOT);
        int num = parseInt(cord.substring(1,2));
        Map<String, Integer> x = new HashMap<String, Integer>();
        x.put("a", 0);
        x.put("b", 1);
        x.put("c", 2);
        x.put("d", 3);
        x.put("e", 4);
        x.put("f", 5);
        x.put("g", 6);
        x.put("h", 7);
        if (!x.containsKey(alpha) || num < 1 || num > 8) {
            throw new IllegalArgumentException();
        }
        return (x.get(alpha) * 8) + (num - 1);
    }

    public void boardState() {
        String[] alpha = new String[]{"A","B","C","D","E","F","G","H"};
        System.out.print("   ");
        for (int i = 0 ; i < this.board.length; i++) {
            System.out.print(i+1 + "  ");
        }
        System.out.println();
        for (int i =  0; i < this.board.length; i++) {
            System.out.print(alpha[i] + "  ");
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j].id + "  ");
            }
            System.out.println();
        }
    }

    public void setUpStandard() {

        // Pawns
        for (int i = 0; i < this.board.length; i++) {
            placePiece(new Pawn(8 + i), 8 + i);
            placePiece(new Pawn(changeCord("g1") + i), changeCord("g1") + i);
        }

        // Rooks
        placePiece(new Rook(), changeCord("a1"));
        placePiece(new Rook(), changeCord("a8"));
        placePiece(new Rook(), changeCord("h1"));
        placePiece(new Rook(), changeCord("h8"));

        // Knights
        placePiece(new Knight(), changeCord("a2"));
        placePiece(new Knight(), changeCord("a7"));
        placePiece(new Knight(), changeCord("h2"));
        placePiece(new Knight(), changeCord("h7"));

        // Bishops
        placePiece(new Bishop(), changeCord("a3"));
        placePiece(new Bishop(), changeCord("a6"));
        placePiece(new Bishop(), changeCord("h3"));
        placePiece(new Bishop(), changeCord("h6"));

        // Queens
        placePiece(new Queen(), changeCord("a4"));
        placePiece(new Queen(), changeCord("h4"));

        // Kings
        placePiece(new King(), changeCord("a5"));
        placePiece(new King(), changeCord("h5"));
    }

    public static String changeCordBack(int cord) {
        int alpha = cord / 8;
        int num = cord % 8;
        Map<Integer, String> x = new HashMap<Integer, String>();
        x.put(0, "a");
        x.put(1, "b");
        x.put(2, "c");
        x.put(3, "d");
        x.put(4, "e");
        x.put(5, "f");
        x.put(6, "g");
        x.put(7, "h");
        if (cord < 0 || cord > 63) {
            throw new IllegalArgumentException();
        }
        return x.get(alpha) + num;
    }

    public Piece getLocation(Piece p) {
        return this.board[0].indexOf()
    }
}