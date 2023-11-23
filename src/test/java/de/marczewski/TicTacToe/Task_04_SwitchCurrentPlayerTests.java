package de.marczewski.TicTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_04_SwitchCurrentPlayerTests {
    @Test
    public void playerIs_X_switch_to_O() {
        TicTacToeStudent.currentPlayer = 'X';
        Assertions.assertEquals('X', TicTacToeStudent.currentPlayer);

        TicTacToeStudent.switchPlayer();

        Assertions.assertEquals('O', TicTacToeStudent.currentPlayer);
    }

    @Test
    public void playerIs_O_switch_to_X() {
        TicTacToeStudent.currentPlayer = 'O';
        Assertions.assertEquals('O', TicTacToeStudent.currentPlayer);

        TicTacToeStudent.switchPlayer();

        Assertions.assertEquals('X', TicTacToeStudent.currentPlayer);
    }
}
