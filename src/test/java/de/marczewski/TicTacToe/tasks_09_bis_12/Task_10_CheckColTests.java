package de.marczewski.TicTacToe.tasks_09_bis_12;

import de.marczewski.TicTacToe.TicTacToeStudent;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_10_CheckColTests {

    @Nested
    public class True {
        @Test
        public void player_X_checkColumn_column0_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][0] = 'X';
            TicTacToeStudent.board[1][0] = 'X';
            TicTacToeStudent.board[2][0] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertTrue(isColumn);
        }

        @Test
        public void player_O_checkColumn_column0_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][0] = 'O';
            TicTacToeStudent.board[1][0] = 'O';
            TicTacToeStudent.board[2][0] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertTrue(isColumn);
        }

        @Test
        public void player_X_checkColumn_column1_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][1] = 'X';
            TicTacToeStudent.board[1][1] = 'X';
            TicTacToeStudent.board[2][1] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(1);

            assertTrue(isColumn);
        }

        @Test
        public void player_O_checkColumn_column1_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][1] = 'O';
            TicTacToeStudent.board[1][1] = 'O';
            TicTacToeStudent.board[2][1] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(1);

            assertTrue(isColumn);
        }

        @Test
        public void player_X_checkColumn_column2_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][2] = 'X';
            TicTacToeStudent.board[1][2] = 'X';
            TicTacToeStudent.board[2][2] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(2);

            assertTrue(isColumn);
        }

        @Test
        public void player_O_checkColumn_column2_isTrue() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][2] = 'O';
            TicTacToeStudent.board[1][2] = 'O';
            TicTacToeStudent.board[2][2] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(2);

            assertTrue(isColumn);
        }
    }

    @Nested
    public class FalseCol0 {

        @Test
        public void player_X_checkColumn_column0_row0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][0] = 'O';
            TicTacToeStudent.board[1][0] = 'X';
            TicTacToeStudent.board[2][0] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_O_checkColumn_column0_row0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][0] = 'X';
            TicTacToeStudent.board[1][0] = 'O';
            TicTacToeStudent.board[2][0] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_X_checkColumn_column0_row1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][0] = 'X';
            TicTacToeStudent.board[1][0] = 'O';
            TicTacToeStudent.board[2][0] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_O_checkColumn_column0_row1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][0] = 'O';
            TicTacToeStudent.board[1][0] = 'X';
            TicTacToeStudent.board[2][0] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }


        @Test
        public void player_X_checkColumn_column0_row2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][0] = 'X';
            TicTacToeStudent.board[1][0] = 'X';
            TicTacToeStudent.board[2][0] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_O_checkColumn_column0_row2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][0] = 'O';
            TicTacToeStudent.board[1][0] = 'O';
            TicTacToeStudent.board[2][0] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }
    }

    @Nested
    public class FalseCol1 {

        @Test
        public void player_X_checkColumn_column1_row0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][1] = 'O';
            TicTacToeStudent.board[1][1] = 'X';
            TicTacToeStudent.board[2][1] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_O_checkColumn_column1_row0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][1] = 'X';
            TicTacToeStudent.board[1][1] = 'O';
            TicTacToeStudent.board[2][1] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_X_checkColumn_column1_row1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][1] = 'X';
            TicTacToeStudent.board[1][1] = 'O';
            TicTacToeStudent.board[2][1] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_O_checkColumn_column1_row1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][1] = 'O';
            TicTacToeStudent.board[1][1] = 'X';
            TicTacToeStudent.board[2][1] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }


        @Test
        public void player_X_checkColumn_column1_row2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][1] = 'X';
            TicTacToeStudent.board[1][1] = 'X';
            TicTacToeStudent.board[2][1] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_O_checkColumn_column1_row2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][1] = 'O';
            TicTacToeStudent.board[1][1] = 'O';
            TicTacToeStudent.board[2][1] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }
    }

    @Nested
    public class FalseCol2 {

        @Test
        public void player_X_checkColumn_column2_row0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][2] = 'O';
            TicTacToeStudent.board[1][2] = 'X';
            TicTacToeStudent.board[2][2] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_O_checkColumn_column2_row0() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][2] = 'X';
            TicTacToeStudent.board[1][2] = 'O';
            TicTacToeStudent.board[2][2] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_X_checkColumn_column2_row1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][2] = 'X';
            TicTacToeStudent.board[1][2] = 'O';
            TicTacToeStudent.board[2][2] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_O_checkColumn_column2_row1() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][2] = 'O';
            TicTacToeStudent.board[1][2] = 'X';
            TicTacToeStudent.board[2][2] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }


        @Test
        public void player_X_checkColumn_column2_row2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'X';

            TicTacToeStudent.board[0][2] = 'X';
            TicTacToeStudent.board[1][2] = 'X';
            TicTacToeStudent.board[2][2] = 'O';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }

        @Test
        public void player_O_checkColumn_column2_row2() {
            TicTacToeStudent.initializeBoard();
            TicTacToeStudent.currentPlayer = 'O';

            TicTacToeStudent.board[0][2] = 'O';
            TicTacToeStudent.board[1][2] = 'O';
            TicTacToeStudent.board[2][2] = 'X';
            boolean isColumn = TicTacToeStudent.checkCol(0);

            assertFalse(isColumn);
        }
    }
}
