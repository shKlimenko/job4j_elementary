package ru.job4j;

public class Main {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Main.plus(100, 500);
        Main.plus(4, 2);
        Main.plus(3, 5);
    }
}