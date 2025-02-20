package com.aurionpro.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeFacadeTest {

    @Test
    public void testGameStart() {
        TicTacToeFacade game = new TicTacToeFacade("Akshat", "JCole");
        assertNotNull(game);
    }

    @Test
    public void testWinningGameScenario() {
        TicTacToeFacade game = new TicTacToeFacade("Akshat", "JCole");
        Board board = new Board();
        GameLogic logic = new GameLogic();

        // Simulate a win for 'X'
        board.updateBoard(1, 'X');
        board.updateBoard(2, 'X');
        board.updateBoard(3, 'X');

        assertTrue(logic.checkWin(board.getBoard(), 'X'));
        assertFalse(logic.checkWin(board.getBoard(), 'O'));
    }

    @Test
    public void testDrawGameScenario() {
        TicTacToeFacade game = new TicTacToeFacade("Akshat", "JCole");
        Board board = new Board();
        GameLogic logic = new GameLogic();

        char[] drawBoard = {'X', 'O', 'X', 'X', 'O', 'O', 'O', 'X', 'X'};
        for (int i = 0; i < 9; i++) {
            board.updateBoard(i + 1, drawBoard[i]);
        }

        assertTrue(logic.isDraw(board.getBoard()));
        assertFalse(logic.checkWin(board.getBoard(), 'X'));
        assertFalse(logic.checkWin(board.getBoard(), 'O'));
    }

}
