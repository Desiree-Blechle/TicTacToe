package de.marczewski.TicTacToe;

import java.util.Scanner;

public class TicTacToeStudent {

    // Das Spielfeld wird als mehrdimensionales Array dargestellt.
    public static char[][] board = new char[3][3];

    // Initialisierung und Deklaration des aktuellen Spielers als char in der Variable currentPlayer.
    public static char currentPlayer = 'X';

     // Die main-Methode initialisiert das Spielfeld, gibt es aus und startet das Spiel.
     // Außerdem ist diese Funktion die start Methode der Anwendung.

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        playGame();
    }

// Diese Methode initialisiert das Spielfeld, indem sie leere Zellen mit dem Zeichen '-' darstellt.
    public static void initializeBoard() {
        for (int i = 0; i < board.length; ++i) {

            for (int j = 0; j < board[i].length; ++j) {
                board[i][j] = '-';
            }
        }
    }

// Diese Methode gibt den aktuellen Zustand des Spielfelds in einem benutzerfreundlichen Format aus.
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; ++i) {

            for (int j = 0; j < board[i].length; ++j) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }

// Diese Methode überprüft, ob ein Zug gültig ist, indem sie sicherstellt,
// dass die ausgewählte Zeile und Spalte im Rahmen des Spielfelds liegen und die Zelle leer ist.
    public static boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

// Diese Methode wechselt den aktuellen Spieler nach jedem Zug zwischen 'X' und 'O'.
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

// Diese Methode bildet den Kern des Spiels.
    public static void playGame() {
        
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        int row, col;

// Sie verwendet eine while-Schleife, um die Eingaben der Spieler entgegenzunehmen,

        while (!gameWon && !isBoardFull()) {
            System.out.println("Spieler " + currentPlayer + ", geben Sie Zeile (0-2) und Spalte (0-2) ein (z.B. '0 0' für die erste Zeile und erste Spalte): ");

            row = scanner.nextInt();
            col = scanner.nextInt();


// Züge zu validieren,

        if (isValidMove(row, col)) {
            if (currentPlayer == 'X') {
                board[row][col] = 'X';
            }
            if (currentPlayer == 'O') {
                board[row][col] = 'O';
            }
            switchPlayer();
        } else {
                System.out.println("Zug ist nicht gültig. Bitte geben Sie eine Zahl zwischen 0 und 2 ein");
        }


  // um den Spieler zu wechseln und nach einem Gewinn zu suchen  bis das Spiel gewonnen ist

        switchPlayer();
        printBoard();
        if (checkWin(row, col)) {
            System.out.println(currentPlayer + " hat gewonnen!");
            gameWon = true;
        } else {
            switchPlayer();
        }

 // oder unentschieden endet

        if (isBoardFull()) {
            System.out.println("Unentschieden");
        }
    }
    }

// Methoden um Gewinn festzustellen:
    // Zeile checken
        public static boolean checkRow ( int row){
            for (int i = 0; i < board.length; i++)
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] == 'X' || board[i][0] == 'O')
                return true;
            }
                return false;

        }

    // Spalte checken
        public static boolean checkCol ( int col) {
            if (board[0][col] == board[1][col] && board[0][col] == board[2][col] ) {
                        if (board[0][col] == 'X' || board[0][col] == 'O') {
                            return true;
                        }

                    } return false;

                }

    // Oben Links nach Unten Rechts checken
        public static boolean checkTopLeftToBottomRight() {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                if (board[0][0] == 'X' || board[0][0] == 'O') {
                    return true;
                }
            }
                return false;
        }

    // oben rechts nach unten links checken
        public static boolean checkTopRightToBottomLeft() {
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                if (board[0][2] == 'X' || board[0][2] == 'O') {
                    return true;
                }

            }
            return false;
        }

  // Diese Methode kombiniert die einzelnen Überprüfungen auf Gewinn,
  // um zu bestimmen, ob der aktuelle Spieler das Spiel gewonnen hat.
        public static boolean checkWin( int row, int col){
            return (checkRow(row) || checkCol(col) || checkTopLeftToBottomRight() || checkTopRightToBottomLeft());
        }

// Diese Methode überprüft, ob das Spielfeld voll ist (ein Unentschieden),
// indem sie jede Zelle daraufhin untersucht, ob sie leer ist.
        public static boolean isBoardFull() {
            for (int i = 0; i<board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                 if (board[i][j] == '-') {
                     return false;
                 }

                }
            }
            return true;
        }
    }
