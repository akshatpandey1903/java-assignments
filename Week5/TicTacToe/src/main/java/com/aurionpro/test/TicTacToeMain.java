package com.aurionpro.test;

import com.aurionpro.model.TicTacToeFacade;

import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player 1 name: ");
        String player1 = scanner.nextLine();

        System.out.print("Enter Player 2 name: ");
        String player2 = scanner.nextLine();

        TicTacToeFacade game = new TicTacToeFacade(player1, player2);
        game.startGame();
    }
}

