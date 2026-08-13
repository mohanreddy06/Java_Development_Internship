package Level_2;

import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    static char currentPlayer = 'X';


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean gameOver = false;

        System.out.println("===== TIC TAC TOE GAME =====");

        while (!gameOver) {

            displayBoard();

            System.out.print("Player " + currentPlayer + ", enter your position (1-9): ");
            int position = sc.nextInt();


            if (makeMove(position)) {

                if (checkWinner()) {
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameOver = true;

                } else if (isDraw()) {
                    displayBoard();
                    System.out.println("Game Draw!");
                    gameOver = true;

                } else {
                    switchPlayer();
                }

            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

        sc.close();
    }


    // Display game board
    public static void displayBoard() {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            System.out.println(
                    " " + board[i][0] +
                            " | " + board[i][1] +
                            " | " + board[i][2]
            );

            if (i < 2) {
                System.out.println("---|---|---");
            }
        }

        System.out.println();
    }


    // Place player's move
    public static boolean makeMove(int position) {

        int row = (position - 1) / 3;
        int col = (position - 1) % 3;


        if (position < 1 || position > 9) {
            return false;
        }


        if (board[row][col] == 'X' || board[row][col] == 'O') {
            return false;
        }


        board[row][col] = currentPlayer;
        return true;
    }


    // Check winning condition
    public static boolean checkWinner() {


        // Rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == currentPlayer &&
                    board[i][1] == currentPlayer &&
                    board[i][2] == currentPlayer) {

                return true;
            }
        }


        // Columns
        for (int i = 0; i < 3; i++) {

            if (board[0][i] == currentPlayer &&
                    board[1][i] == currentPlayer &&
                    board[2][i] == currentPlayer) {

                return true;
            }
        }


        // Diagonals
        if (board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer) {

            return true;
        }


        if (board[0][2] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][0] == currentPlayer) {

            return true;
        }


        return false;
    }


    // Check draw condition
    public static boolean isDraw() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    return false;
                }
            }
        }

        return true;
    }


    // Change player
    public static void switchPlayer() {

        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}