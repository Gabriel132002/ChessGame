package org.example.chess.chess.pieces;

import org.example.boardgame.Board;
import org.example.boardgame.Position;
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

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean mat [][] = new boolean[getBoard().getColumns()][getBoard().getRows()];

        Position p = new Position(0,0);
        //acima
        p.setValues(position.getRow() -1, position.getColumn());
        if (getBoard().positionExists(p)&& canMove(p)) mat[p.getRow()][p.getColumn()] = true;
        //abaixo
        p.setValues(position.getRow() +1, position.getColumn());
        if (getBoard().positionExists(p)&& canMove(p)) mat[p.getRow()][p.getColumn()] = true;
        //esquerda
        p.setValues(position.getRow(), position.getColumn()-1);
        if (getBoard().positionExists(p)&& canMove(p)) mat[p.getRow()][p.getColumn()] = true;
        //direita
        p.setValues(position.getRow(), position.getColumn()+1);
        if (getBoard().positionExists(p)&& canMove(p)) mat[p.getRow()][p.getColumn()] = true;
        //noroeste
        p.setValues(position.getRow() -1, position.getColumn()-1);
        if (getBoard().positionExists(p)&& canMove(p)) mat[p.getRow()][p.getColumn()] = true;
        //nordeste
        p.setValues(position.getRow() -1, position.getColumn() +1);
        if (getBoard().positionExists(p)&& canMove(p)) mat[p.getRow()][p.getColumn()] = true;
        //sudoeste
        p.setValues(position.getRow() +1, position.getColumn()-1);
        if (getBoard().positionExists(p)&& canMove(p)) mat[p.getRow()][p.getColumn()] = true;
        //sudeste
        p.setValues(position.getRow() +1, position.getColumn()+1);
        if (getBoard().positionExists(p)&& canMove(p)) mat[p.getRow()][p.getColumn()] = true;
        return mat;
    }
}
