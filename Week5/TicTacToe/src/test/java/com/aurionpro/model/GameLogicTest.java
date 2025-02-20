package com.aurionpro.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameLogicTest {

    GameLogic gameLogic;

    @BeforeEach
    void init(){
        gameLogic = new GameLogic();
    }

    @Test
    public void testWinningCondition() {
        char[] boardRow = {'X', 'X', 'X', '4', '5', '6', '7', '8', '9'};
        char[] boardColun = {'X', '2', '3', 'X', '5', '6', 'X', '8', '9'};
        char[] boardDiagonal = {'X', '2', '3', '4', 'X', '6', '7', '8', 'X'};

        assertTrue(gameLogic.checkWin(boardRow, 'X'));
        assertTrue(gameLogic.checkWin(boardColun, 'X'));
        assertTrue(gameLogic.checkWin(boardDiagonal, 'X'));
    }

    @Test
    public void testNoWinner() {
        char[] boardDiagonal = {'X', '2', '3', 'X', '5', '6', '7', '8', 'X'};
        assertFalse(gameLogic.checkWin(boardDiagonal, 'X'));
    }

    @Test
    public void testDrawCondition() {
        char[] board = {'X', 'O', 'O', 'O', 'O', 'X', 'X', 'X', 'O'};
        assertFalse(gameLogic.checkWin(board, 'X'));
        assertTrue(gameLogic.isDraw(board));
    }
}

