package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] tabl = new int[size][size];
        for (int i = 0; i < tabl.length; i++) {
            for (int j = 0; j < tabl[i].length; j++) {
                tabl[i][j] = (i + 1) * (j + 1);
            }
        }
        return tabl;
    }
}
