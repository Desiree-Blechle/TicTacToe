package de.marczewski.TicTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_01_InitializeBoardTests {

    @Test
    public void testInitializeBoard() {
        TicTacToeStudent.initializeBoard();

        Assertions.assertEquals('-', TicTacToeStudent.board[0][0], "Das Feld board[0][0] ist nicht mit '-' initialisiert.");
        Assertions.assertEquals('-', TicTacToeStudent.board[0][1], "Das Feld board[0][1] ist nicht mit '-' initialisiert.");
        Assertions.assertEquals('-', TicTacToeStudent.board[0][2], "Das Feld board[0][2] ist nicht mit '-' initialisiert.");

        Assertions.assertEquals('-', TicTacToeStudent.board[1][0], "Das Feld board[1][0] ist nicht mit '-' initialisiert.");
        Assertions.assertEquals('-', TicTacToeStudent.board[1][1], "Das Feld board[1][1] ist nicht mit '-' initialisiert.");
        Assertions.assertEquals('-', TicTacToeStudent.board[1][2], "Das Feld board[1][2] ist nicht mit '-' initialisiert.");

        Assertions.assertEquals('-', TicTacToeStudent.board[2][0], "Das Feld board[2][0] ist nicht mit '-' initialisiert.");
        Assertions.assertEquals('-', TicTacToeStudent.board[2][1], "Das Feld board[2][1] ist nicht mit '-' initialisiert.");
        Assertions.assertEquals('-', TicTacToeStudent.board[2][2], "Das Feld board[2][2] ist nicht mit '-' initialisiert.");
    }

}
