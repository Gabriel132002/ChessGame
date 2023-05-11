package org.example.chess;


import lombok.Getter;
import org.example.boardgame.Board;
import org.example.boardgame.Piece;

@Getter
public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
