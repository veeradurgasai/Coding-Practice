// TicTacToe Game
// Reference: KUNAL KUSHWAHA's video

import java.util.Scanner;

public class Ult {

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static boolean hasWon(char[][] board, char player) {

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Initialize board
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }

        Scanner sc = new Scanner(System.in);
        char player = 'X';
        boolean gameOver = false;

        System.out.println("=== TIC TAC TOE ===");
        System.out.println("Enter row and column values between 0 and 2.");

        while (!gameOver) {

            printBoard(board);

            System.out.println("Player " + player + ", enter row and column : ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            // Check valid position
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid position! Try again.");
                continue;
            }

            // Check if cell is empty
            if (board[row][col] == ' ') {
                board[row][col] = player;
                // Check winner
                if (hasWon(board, player)) {
                    printBoard(board);
                    System.out.println("Player " + player + " has WON!");
                    gameOver = true;
                }
                // Check draw
                else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a DRAW!");
                    gameOver = true;
                }
                // Switch player
                else {
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                }
            } else {
                System.out.println("Cell already occupied! Try again.");
            }
        }
        sc.close();
    }
}