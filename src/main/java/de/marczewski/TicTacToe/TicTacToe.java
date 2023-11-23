package de.marczewski.TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    // Das Spielfeld wird als mehrdimensionales Array dargestellt.
    // Das Array board enthält 3 Arrays, die jeweils 3 Chars enthalten.
    public static char[][] board = new char[3][3];

    // Initialisierung und deklaration des aktuellen Spielers als char in der Variable currentPlayer.
    public static char currentPlayer = 'X';


    /**
     * Die main-Methode initialisiert das Spielfeld, gibt es aus und startet das Spiel.
     * Außerdem ist diese Funktion die start Methode der Anwendung.
     */
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        playGame();
    }


    /**
     * In dieser Methode sollen die leeren Chars aus dem mehrdimensionalen Array 'board' mit dem Wert '-' gefüllt werden.
     * <p>
     * Dafür muss das Array 'board' mit 2 for-Schleifen durchlaufen werden.
     * In der ersten for-Schleife wird das Array 'board' durchlaufen.
     * In der zweiten for-Schleife wird jedes Array, das durch die erste for-Schleife ausgewählt wurde, durchlaufen.
     * Hierbei wird jedes Element des Arrays mit dem Wert '-' gefüllt.
     * <p>
     * Für eine visuelle Darstellung des Arrays kann in der ersten Schleife ein System.out.println(< aktuelles array >)
     * eingefügt werden.
     * Ist der Test grün und die Methode funktioniert, kann diese Ausgabe entfernt werden.
     * Jedes der 3 Arrays sieht am Ende in der Konsole so aus: ---
     */
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }


    /**
     * In dieser Methode soll das Spielfeld ausgegeben werden.
     * Dafür muss das Array 'board' mit 2 for-Schleifen durchlaufen werden.
     * In der ersten for-Schleife wird das Array 'board' durchlaufen.
     * In der zweiten for-Sc String[0]hleife wird jedes Array, das durch die erste for-Schleife ausgewählt wurde, durchlaufen.
     * Hier wird am Anfang der Zeile ein | ausgegeben, dann das aktuelle Element des Arrays, dann ein | usw.
     * Nach dem Array wird ein Zeilenumbruch ausgegeben und eine Trennlinie (-------------). Kopiert diese Trennlinie,
     * denn es wird genau diese im Test erwartet.
     * Für die Ausgabe kann ein System.out.println() verwendet werden.
     * Am Ende soll das fertige Board in der Ausgabe so aussehen:
     * <p>
     * (Board nach der Initialisierung)
     *          -------------
     *          | - | - | - |
     *          -------------
     *          | - | - | - |
     *          -------------
     *          | - | - | - |
     *          -------------
     *
     * Der vorhandene Test testet nur auf das Board nach der Initialisierung.
     */
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                String delimiter = j < 2 ? " | " : " |";
                System.out.print(board[i][j] + delimiter);
            }
            System.out.println("\n-------------");
        }
    }

    /**
     * Diese Methode soll überprüfen, ob der Zug gültig ist. Damit ist gemeint, dass das Feld, auf das der Spieler
     * setzen möchte, nicht bereits belegt ist und sich auf dem Spielfeld befindet.
     * <p>
     * Es müssen die Längen der Arrays beachtet werden. Das Array 'board' hat 3 Arrays (Rows)
     * mit jeweils 3 Elementen (Cols). Außerdem darf das Feld nicht bereits belegt sein,
     * also nicht den Wert 'X' oder 'O' haben.
     *
     * @param row index der Zeile
     * @param col index der Spalte
     * @return true, wenn der Zug gültig ist, sonst false
     */
    public static boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }


    /**
     * Diese Methode soll den aktuellen Spieler wechseln.
     * <p>
     * Der aktuelle Spieler wird in der Variable 'currentPlayer' gespeichert.
     * Ist der aktuelle Spieler 'X', soll er zu 'O' werden.
     */
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }


    // TODO: Kommentare fertig schreiben

    /**
     * Diese Methode wird die größte Logik der Anwendung enthalten.
     * In ihr wird der Scanner und eine while do Schleife implementiert.
     * Ausserdem werden die Eingaben des Spielers entgegengenommen und überprüft, ob diese gültig sind und ob der Spieler gewonnen hat.
     */
    public static void playGame() {

        // Initialisierung des Scanners um die Eingaben des Spielers entgegenzunehmen.
        Scanner scanner = new Scanner(System.in);  // Bleibt stehen
        boolean gameWon = false;
        int row, col;

        // Die while-Schleife wird so lange durchlaufen, bis das Spiel gewonnen wurde oder das Spielfeld voll ist.
        while (!gameWon && !isBoardFull()) {
            System.out.println("Spieler " + currentPlayer + ", geben Sie Zeile (0-2) und Spalte (0-2) ein (z.B. '0 0' für die erste Zeile und erste Spalte): ");
            //TODO: Eingabe des Spielers über den Scanner entgegennehmen und in row und col speichern. (Richtigen Datentyp verwenden)
            row = scanner.nextInt();
            col = scanner.nextInt();


            // TODO: Überprüfen, ob der Zug gültig ist.
            //  Wenn ja, setze das Zeichen des aktuellen Spielers auf das Spielfeld.
            //  Wenn nein, gib über die Konsole eine Fehlermeldung aus.
            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                printBoard();
                if (checkWin(row, col)) {
                    System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                    gameWon = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Ungültiger Zug. Bitte erneut versuchen.");
            }
        }


        if (!gameWon) {
            System.out.println("Unentschieden!");
        }
    }

    /**
     * Überprüft, ob alle Einträge in einer Reihe gleich sind.
     *
     * @param row Index der Zeile die überprüft werden soll
     * @return true, wenn alle Einträge in einer Reihe gleich sind, sonst false
     */
    public static boolean checkRow(int row) {
        return (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer);
    }

    /**
     * Überprüft, ob alle Einträge in einer Spalte gleich sind.
     *
     * @param col Index der Spalte die überprüft werden soll
     * @return true, wenn alle Einträge in einer Spalte gleich sind, sonst false
     */
    public static boolean checkCol(int col) {
        return (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer);
    }

    /**
     * Überprüft, ob alle Einträge in der Diagonalen links oben 0,0 nach rechts unten 2,2 gleich sind.
     *
     * @return true, wenn alle Einträge in der Diagonalen gleich sind, sonst false
     */
    public static boolean checkTopLeftToBottomRight() {
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer);
    }

    /**
     * Überprüft, ob alle Einträge in der Diagonalen rechts oben 0,2 nach links unten 2,0 gleich sind.
     *
     * @return true, wenn alle Einträge in der Diagonalen gleich sind, sonst false
     */
    public static boolean checkTopRightToBottomLeft() {
        return (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    /**
     * Sammlung aller Überprüfungen, ob der Spieler gewonnen hat.
     * Die Methoden checkRow, checkCol, checkDiagonal und checkAntiDiagonal mit einem ODER aneinander gereiht.
     *
     * @param row Index der Reihe
     * @param col Index der Spalte
     * @return true, wenn der Spieler gewonnen hat, sonst false
     */
    public static boolean checkWin(int row, int col) {
        return (checkRow(row) || checkCol(col) || checkTopLeftToBottomRight() || checkTopRightToBottomLeft());
    }

    /**
     * Überprüft, ob das Spielfeld voll ist.
     * <p>
     * Dafür muss das Array 'board' mit 2 for-Schleifen durchlaufen werden.
     * In der ersten for-Schleife wird das Array 'board' durchlaufen.
     * In der zweiten for-Schleife wird jedes Array, das durch die erste for-Schleife ausgewählt wurde, durchlaufen.
     * Hierbei wird überprüft, ob das aktuelle Element des Arrays den Wert '-' hat.
     * Wenn ja, ist das Spielfeld nicht voll und die Methode gibt false zurück.
     * Wenn kein Element des Arrays den Wert '-' hat, ist das Spielfeld voll und die Methode gibt true zurück.
     *
     * @return true, wenn das Board voll ist, sonst false
     */
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
