package chess;

import chess.Piece.Bishop;
import chess.Piece.King;
import chess.Piece.Knight;
import chess.Piece.Pawn;
import chess.Piece.Queen;
import chess.Piece.Rook;

public class Board {
    private Block[][] blocks;

    public Board() {
        initializeBlocks();
    }

    private void initializeBlocks() {
        blocks = new Block[8][8];
        // Setting white pieces
        blocks[0][0] = new Block(0, 0, new Rook(true));
        blocks[1][0] = new Block(1, 0, new Knight(true));
        blocks[2][0] = new Block(2, 0, new Bishop(true));
        blocks[3][0] = new Block(3, 0, new Queen(true));
        blocks[4][0] = new Block(4, 0, new King(true));
        blocks[5][0] = new Block(5, 0, new Bishop(true));
        blocks[6][0] = new Block(6, 0, new Knight(true));
        blocks[7][0] = new Block(7, 0, new Rook(true));
        // Setting white pawns
        for (int x = 0; x < 8; x++) {
            blocks[x][1] = new Block(x, 1, new Pawn(true));
        }

        // Setting black pieces
        blocks[0][7] = new Block(0, 7, new Rook(false));
        blocks[1][7] = new Block(1, 7, new Knight(false));
        blocks[2][7] = new Block(2, 7, new Bishop(false));
        blocks[3][7] = new Block(3, 7, new Queen(false));
        blocks[4][7] = new Block(4, 7, new King(false));
        blocks[5][7] = new Block(5, 7, new Bishop(false));
        blocks[6][7] = new Block(6, 7, new Knight(false));
        blocks[7][7] = new Block(7, 7, new Rook(false));
        // Setting black pawns
        for (int x = 0; x < 8; x++) {
            blocks[x][6] = new Block(x, 6, new Pawn(false));
        }

        // Defining rest of the blocks having no pieces
        for (int x = 0; x < 8; x++) {
            for (int y = 2; y < 6; y++) {
                blocks[x][y] = new Block(x, y, null);
            }
        }
    }

    public Block getBlock(int x, int y) {
        return blocks[x][y];
    }
}