package chess.Piece;

import java.util.List;

import chess.Block;
import chess.Board;

public abstract class Piece {
    // Attributes
    private Boolean white;
    private Boolean killed;

    // Constructor
    public Piece(Boolean white) {
        this.white = white;
        this.killed = false;
    }

    // Getters
    public Boolean isWhite() {
        return white;
    }

    public Boolean isKilled() {
        return killed;
    }

    // Setters
    public void setKilled(Boolean killed) {
        this.killed = killed;
    }

    // Abstract Methods
    public abstract Boolean canMove(Board board, Block startBlock, Block endBlock);

    public abstract List<String> getValidMoves(Board board, Block startBlock);
}