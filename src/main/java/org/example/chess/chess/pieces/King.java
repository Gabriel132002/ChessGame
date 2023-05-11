package org.example.chess.chess.pieces;

import org.example.boardgame.Board;
import org.example.chess.ChessPiece;
import org.example.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "K";
    }
}
