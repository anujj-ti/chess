package chess;

import java.util.ArrayList;
import java.util.Scanner;

import chess.Board;
import chess.Block;
import chess.Move;
import chess.Player;
import chess.Status;

public class Game {
    private Board board;
    // Assming player 1 is white and player 2 is black
    private Player player1;
    private Player player2;

    boolean isWhiteTurn;

    private ArrayList<Move> gameLog;
    private Status status;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.isWhiteTurn = true;
        this.gameLog = new ArrayList<>();
        this.status = Status.ACTIVE;
    }

    public void start() {
        while (status == Status.ACTIVE) {
            Player currentPlayer = isWhiteTurn ? player1 : player2;
            int startX = 0, startY = 0, endX = 0, endY = 0;
            Block startBlock = board.getBlock(startX, startY);
            Block endBlock = board.getBlock(endX, endY);
            Move move = new Move(startBlock, endBlock);
            makeMove(move);
        }   
    }

    public void makeMove(Move move) {
        if (move.isValid()) {
            gameLog.add(move);
            isWhiteTurn = !isWhiteTurn;
        }
    }
}
