package org.example;


import org.example.chess.ChassMatch;

public class Main {
    public static void main(String[] args) {

        ChassMatch chassMatch = new ChassMatch();
        UI.printBoard(chassMatch.getPieces());

    }
}