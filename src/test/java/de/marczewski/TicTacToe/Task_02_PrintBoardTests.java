package de.marczewski.TicTacToe;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_02_PrintBoardTests {
    @Test
    public void testPrintBoard() {
        String expectedOutput = """
                -------------
                | - | - | - |
                -------------
                | - | - | - |
                -------------
                | - | - | - |
                -------------
                """;

        // To test the system out print
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Init board
        TicTacToeStudent.initializeBoard();

        // Print Board
        TicTacToeStudent.printBoard();

        // Assertions
        assertEquals(expectedOutput, outContent.toString());
    }
}
