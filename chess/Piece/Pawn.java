package chess.Piece;

import java.util.ArrayList;
import java.util.List;

import chess.Board;
import chess.Block;

public class Pawn extends Piece {
    public Pawn(Boolean white) {
        super(white);
    }

    public List<String> getValidMoves(Board board, Block startBlock) {
        List<String> validMoves = new ArrayList<>();
        return validMoves;
    }

    public Boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
