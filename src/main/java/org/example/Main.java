package org.example;


import org.example.chess.ChassMatch;
import org.example.chess.ChessException;
import org.example.chess.ChessPiece;
import org.example.chess.ChessPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ChassMatch chassMatch = new ChassMatch();
        List<ChessPiece> captured = new ArrayList<>();


        while (true) {
            try {
                UI.clearScreen();
                UI.printMatch(chassMatch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(in);

                boolean[][] possibleMoves = chassMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chassMatch.getPieces(), possibleMoves);


                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(in);

                ChessPiece capturedPiece = chassMatch.performChessMove(source, target);

                if (capturedPiece != null) captured.add(capturedPiece);
            } catch (ChessException c) {
                System.out.println(c.getMessage());
                in.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                in.nextLine();
            }
        }

    }
}