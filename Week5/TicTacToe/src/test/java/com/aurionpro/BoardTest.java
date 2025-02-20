package com.aurionpro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    @BeforeEach
    void init(){
        board = new Board();
    }

    @Test
    void testInitialBoardState(){
        char[] expected = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        assertArrayEquals(expected, board.getBoard());
    }

    @Test
    public void testValidMove() {
        Board board = new Board();
        assertTrue(board.updateBoard(1, 'X'));
        assertEquals('X', board.getBoard()[0]);
    }

    @Test
    public void testBoardReset(){
        board.updateBoard(1, 'O');
        board.resetBoard();
        char[] expected = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        assertArrayEquals(expected, board.getBoard());
    }
}