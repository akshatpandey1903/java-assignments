package com.aurionpro.model;

public class Board {

    private char[] board;

    public Board(){
        board = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }

    public void boardDisplay(){
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    public boolean updateBoard(int position, char mark) {
        if (position < 1 || position > 9 || board[position - 1] == 'X' || board[position - 1] == 'O') {
            return false;
        }
        board[position - 1] = mark;
        return true;
    }

    public char[] getBoard(){
        return board;
    }

    public void resetBoard(){
        board = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }

}
