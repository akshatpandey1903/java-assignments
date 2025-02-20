package com.aurionpro.model;

import java.util.Scanner;

public class TicTacToeFacade {
    private Board board;
    private GameLogic gameLogic;
    private Player player1, player2;
    private boolean isPlayer1Turn;
    private Scanner scanner;

    public TicTacToeFacade(String player1Name, String player2Name) {
        board = new Board();
        gameLogic = new GameLogic();
        player1 = new Player(player1Name, 'X');
        player2 = new Player(player2Name, 'O');
        isPlayer1Turn = true;
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        while (true) {
            board.boardDisplay();
            Player currentPlayer = isPlayer1Turn ? player1 : player2;
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getMark() + "). Enter position (1-9): ");

            int position = scanner.nextInt();
            if (!board.updateBoard(position, currentPlayer.getMark())) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            if (gameLogic.checkWin(board.getBoard(), currentPlayer.getMark())) {
                board.boardDisplay();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if (gameLogic.isDraw(board.getBoard())) {
                board.boardDisplay();
                System.out.println("Game is a draw!");
                break;
            }

            isPlayer1Turn = !isPlayer1Turn;
        }

        System.out.println("Do you want to play again? (yes/no)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("no")) {
            System.out.println("Thanks for playing!");
            return;
        }
        resetGame();
        startGame();
    }

    private void resetGame() {
        board.resetBoard();
        isPlayer1Turn = true;
    }
}

