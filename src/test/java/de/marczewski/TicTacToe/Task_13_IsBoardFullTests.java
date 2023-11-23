package de.marczewski.TicTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_13_IsBoardFullTests {

    @Test
    public void isBoardFull_playerX_true() {
        TicTacToeStudent.currentPlayer = 'X';
        TicTacToeStudent.board = new char[][]{
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'}
        };

        assertTrue(TicTacToeStudent.isBoardFull());
    }

    @Test
    public void isBoardFull_playerO_true() {
        TicTacToeStudent.currentPlayer = 'O';
        TicTacToeStudent.board = new char[][]{
                {'O', 'O', 'O'},
                {'O', 'O', 'O'},
                {'O', 'O', 'O'}
        };

        assertTrue(TicTacToeStudent.isBoardFull());
    }

    @Test
    public void isBoardFull_playerX_false() {
        TicTacToeStudent.currentPlayer = 'X';
        TicTacToeStudent.board = new char[][]{
                {'-', 'X', 'X'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'}
        };

        assertFalse(TicTacToeStudent.isBoardFull());
    }

    @Test
    public void isBoardFull_playerO_false() {
        TicTacToeStudent.currentPlayer = 'O';
        TicTacToeStudent.board = new char[][]{
                {'-', 'O', 'O'},
                {'O', 'O', 'O'},
                {'O', 'O', 'O'}
        };

        assertFalse(TicTacToeStudent.isBoardFull());
    }
}
