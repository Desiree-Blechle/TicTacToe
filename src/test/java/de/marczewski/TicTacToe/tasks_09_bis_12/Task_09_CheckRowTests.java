package de.marczewski.TicTacToe.tasks_09_bis_12;

import de.marczewski.TicTacToe.TicTacToeStudent;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_09_CheckRowTests {
    @Nested
    public class True {
        @Test
        public void player_X_checkRow_row0_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][0] = 'X';
            TicTacToeStudent.board[0][1] = 'X';
            TicTacToeStudent.board[0][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertTrue(isRow);
        }

        @Test
        public void player_O_checkRow_row0_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][0] = 'O';
            TicTacToeStudent.board[0][1] = 'O';
            TicTacToeStudent.board[0][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertTrue(isRow);
        }

        @Test
        public void player_X_checkRow_row1_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[1][0] = 'X';
            TicTacToeStudent.board[1][1] = 'X';
            TicTacToeStudent.board[1][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(1);

            assertTrue(isRow);
        }

        @Test
        public void player_O_checkRow_row1_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[1][0] = 'O';
            TicTacToeStudent.board[1][1] = 'O';
            TicTacToeStudent.board[1][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(1);

            assertTrue(isRow);
        }

        @Test
        public void player_X_checkRow_row2_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[2][0] = 'X';
            TicTacToeStudent.board[2][1] = 'X';
            TicTacToeStudent.board[2][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(2);

            assertTrue(isRow);
        }

        @Test
        public void player_O_checkRow_row2_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[2][0] = 'O';
            TicTacToeStudent.board[2][1] = 'O';
            TicTacToeStudent.board[2][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(2);

            assertTrue(isRow);
        }
    }

    @Nested
    public class FalseRow0 {
        @Test
        public void player_X_checkRow_row0_col0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][0] = 'O';
            TicTacToeStudent.board[0][1] = 'X';
            TicTacToeStudent.board[0][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_O_checkRow_row0_col0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][0] = 'X';
            TicTacToeStudent.board[0][1] = 'O';
            TicTacToeStudent.board[0][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_X_checkRow_row0_col1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][0] = 'X';
            TicTacToeStudent.board[0][1] = 'O';
            TicTacToeStudent.board[0][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_O_checkRow_row0_col1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][0] = 'O';
            TicTacToeStudent.board[0][1] = 'X';
            TicTacToeStudent.board[0][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_X_checkRow_row0_col2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][0] = 'X';
            TicTacToeStudent.board[0][1] = 'X';
            TicTacToeStudent.board[0][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_O_checkRow_row0_col2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][0] = 'O';
            TicTacToeStudent.board[0][1] = 'O';
            TicTacToeStudent.board[0][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }
    }

    @Nested
    public class FalseRow1 {
        @Test
        public void player_X_checkRow_row1_col0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[1][0] = 'O';
            TicTacToeStudent.board[1][1] = 'X';
            TicTacToeStudent.board[1][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_O_checkRow_row1_col0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[1][0] = 'X';
            TicTacToeStudent.board[1][1] = 'O';
            TicTacToeStudent.board[1][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_X_checkRow_row1_col1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[1][0] = 'X';
            TicTacToeStudent.board[1][1] = 'O';
            TicTacToeStudent.board[1][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_O_checkRow_row1_col1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[1][0] = 'O';
            TicTacToeStudent.board[1][1] = 'X';
            TicTacToeStudent.board[1][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_X_checkRow_row1_col2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[1][0] = 'X';
            TicTacToeStudent.board[1][1] = 'X';
            TicTacToeStudent.board[1][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_O_checkRow_row1_col2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[1][0] = 'O';
            TicTacToeStudent.board[1][1] = 'O';
            TicTacToeStudent.board[1][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }
    }

    @Nested
    public class FalseRow2 {
        @Test
        public void player_X_checkRow_row2_col0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[2][0] = 'O';
            TicTacToeStudent.board[2][1] = 'X';
            TicTacToeStudent.board[2][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_O_checkRow_row2_col0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[2][0] = 'X';
            TicTacToeStudent.board[2][1] = 'O';
            TicTacToeStudent.board[2][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_X_checkRow_row2_col1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[2][0] = 'X';
            TicTacToeStudent.board[2][1] = 'O';
            TicTacToeStudent.board[2][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_O_checkRow_row2_col1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[2][0] = 'O';
            TicTacToeStudent.board[2][1] = 'X';
            TicTacToeStudent.board[2][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_X_checkRow_row2_col2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[2][0] = 'X';
            TicTacToeStudent.board[2][1] = 'X';
            TicTacToeStudent.board[2][2] = 'O';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }

        @Test
        public void player_O_checkRow_row2_col2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[2][0] = 'O';
            TicTacToeStudent.board[2][1] = 'O';
            TicTacToeStudent.board[2][2] = 'X';
            boolean isRow = TicTacToeStudent.checkRow(0);

            assertFalse(isRow);
        }
    }
}
