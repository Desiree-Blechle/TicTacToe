package de.marczewski.TicTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_03_IsValidMoveTests {
    @Test
    public void blankBoard_move_isValid() {
        TicTacToeStudent.initializeBoard();
        int row = 1;
        int col = 2;
        boolean isValidMove = TicTacToeStudent.isValidMove(row, col);

        Assertions.assertTrue(isValidMove, "Die Rückgabe von isValidMove ist nicht korrekt.");
    }


    @Test
    public void move_onNotEmptyPlace_X_isInValid() {
        TicTacToeStudent.initializeBoard();
        TicTacToeStudent.board[1][2] = 'X';
        int row = 1;
        int col = 2;
        boolean isValidMove = TicTacToeStudent.isValidMove(row, col);

        Assertions.assertFalse(isValidMove, "Feld ist mit X belegt, isValidMove sollte false zurückgeben.");
    }

    @Test
    public void move_onNotEmptyPlace_O_isInValid() {
        TicTacToeStudent.initializeBoard();
        TicTacToeStudent.board[0][0] = '0';
        int row = 0;
        int col = 0;
        boolean isValidMove = TicTacToeStudent.isValidMove(row, col);

        Assertions.assertFalse(isValidMove, "Feld ist mit O belegt, isValidMove sollte false zurückgeben.");
    }

    @Test
    public void move_row_positive_isOutside_isInValid() {
        TicTacToeStudent.initializeBoard();
        int row = 3;
        int col = 0;
        boolean isValidMove = TicTacToeStudent.isValidMove(row, col);

        Assertions.assertFalse(isValidMove, "isValidMove sollte false zurückgeben, wenn row > 2 ist.");
    }

    @Test
    public void move_col_positive_isOutside_isInValid() {
        TicTacToeStudent.initializeBoard();
        int row = 0;
        int col = 3;
        boolean isValidMove = TicTacToeStudent.isValidMove(row, col);

        Assertions.assertFalse(isValidMove);
    }

    @Test
    public void move_col_and_row_positive_isOutside_isInValid() {
        TicTacToeStudent.initializeBoard();
        int row = 3;
        int col = 3;
        boolean isValidMove = TicTacToeStudent.isValidMove(row, col);

        Assertions.assertFalse(isValidMove);
    }

    @Test
    public void move_row_negative_isOutside_isInValid() {
        TicTacToeStudent.initializeBoard();
        int row = -1;
        int col = 0;
        boolean isValidMove = TicTacToeStudent.isValidMove(row, col);

        Assertions.assertFalse(isValidMove);
    }

    @Test
    public void move_col_negative_isOutside_isInValid() {
        TicTacToeStudent.initializeBoard();
        int row = 0;
        int col = -1;
        boolean isValidMove = TicTacToeStudent.isValidMove(row, col);

        Assertions.assertFalse(isValidMove);
    }

    @Test
    public void move_col_and_row_negative_isOutside_isInValid() {
        TicTacToeStudent.initializeBoard();
        int row = -1;
        int col = -1;
        boolean isValidMove = TicTacToeStudent.isValidMove(row, col);

        Assertions.assertFalse(isValidMove);
    }
}
