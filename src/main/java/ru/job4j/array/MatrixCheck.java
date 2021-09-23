package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                return MatrixCheck.monoHorizontal(board, i) || MatrixCheck.monoVertical(board, i);
            }
        }
        return false;
    }

    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
}
