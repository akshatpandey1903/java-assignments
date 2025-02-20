package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class GameLogic {

    public boolean checkWin(char[] board, char mark){
        Integer[][] winPatterns = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}
        };

        for(Integer[] pattern : winPatterns){
            if(board[pattern[0]] == mark && board[pattern[1]] == mark && board[pattern[2]] == mark){
                return true;
            }
        }

        return false;
    }

    public boolean isDraw(char[] board){
        for(char c : board){
            if(c != 'X' && c != 'O')
                return false;
        }
        return true;
    }

}
