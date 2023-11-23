package de.marczewski.TicTacToe.tasks_09_bis_12;

import de.marczewski.TicTacToe.TicTacToeStudent;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_11_CheckTopLeftToBottomRightTests {

    @Nested
    public class True {
        @Test
        public void topLeftToBottomRight_X_isTrue() {
            TicTacToeStudent.currentPlayer = 'X';
            TicTacToeStudent.board = new char[][]{
                    {'X', '-', '-'},
                    {'-', 'X', '-'},
                    {'-', '-', 'X'}
            };

            assertTrue(TicTacToeStudent.checkTopLeftToBottomRight());
        }

        @Test
        public void topLeftToBottomRight_O_isTrue() {
            TicTacToeStudent.currentPlayer = 'O';
            TicTacToeStudent.board = new char[][]{
                    {'O', '-', '-'},
                    {'-', 'O', '-'},
                    {'-', '-', 'O'}
            };

            assertTrue(TicTacToeStudent.checkTopLeftToBottomRight());
        }

    }

    @Nested
    public class False {
        @Test
        public void row0_notX_isFalse() {
            TicTacToeStudent.currentPlayer = 'X';
            TicTacToeStudent.board = new char[][]{
                    {'O', '-', '-'},
                    {'-', 'X', '-'},
                    {'-', '-', 'X'}
            };

            assertFalse(TicTacToeStudent.checkTopLeftToBottomRight());
        }

        @Test
        public void row1_notX_isFalse() {
            TicTacToeStudent.currentPlayer = 'X';
            TicTacToeStudent.board = new char[][]{
                    {'X', '-', '-'},
                    {'-', 'O', '-'},
                    {'-', '-', 'X'}
            };

            assertFalse(TicTacToeStudent.checkTopLeftToBottomRight());
        }

        @Test
        public void row2_notX_isFalse() {
            TicTacToeStudent.currentPlayer = 'X';
            TicTacToeStudent.board = new char[][]{
                    {'X', '-', '-'},
                    {'-', 'X', '-'},
                    {'-', '-', 'O'}
            };

            assertFalse(TicTacToeStudent.checkTopLeftToBottomRight());
        }

        @Test
        public void row0_notO_isFalse() {
            TicTacToeStudent.currentPlayer = 'O';
            TicTacToeStudent.board = new char[][]{
                    {'X', '-', '-'},
                    {'-', 'O', '-'},
                    {'-', '-', 'O'}
            };

            assertFalse(TicTacToeStudent.checkTopLeftToBottomRight());
        }

        @Test
        public void row1_notO_isFalse() {
            TicTacToeStudent.currentPlayer = 'X';
            TicTacToeStudent.board = new char[][]{
                    {'O', '-', '-'},
                    {'-', 'X', '-'},
                    {'-', '-', 'O'}
            };

            assertFalse(TicTacToeStudent.checkTopLeftToBottomRight());
        }

        @Test
        public void row2_notO_isFalse() {
            TicTacToeStudent.currentPlayer = 'X';
            TicTacToeStudent.board = new char[][]{
                    {'O', '-', '-'},
                    {'-', 'O', '-'},
                    {'-', '-', 'X'}
            };

            assertFalse(TicTacToeStudent.checkTopLeftToBottomRight());
        }

    }
}
