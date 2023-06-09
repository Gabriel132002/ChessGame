package org.example.chess;


import lombok.Getter;
import org.example.boardgame.Board;
import org.example.boardgame.Piece;
import org.example.boardgame.Position;

@Getter
public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
