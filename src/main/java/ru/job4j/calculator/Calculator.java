package ru.job4j.calculator;

public class Calculator {
    private  static int x = 5;

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public static int multiply(int b) {
        return b * x;
    }

    public int sum(int b) {
        return b + x;
    }

    public int sumAllOperation(int r) {
        return sum(r) + divide(r) + minus(r) + multiply(r);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        Calculator calc = new Calculator();
        String ln = System.lineSeparator();
        System.out.println("Метод divide(10): " + calc.divide(10) + ln
                        + "Метод sum(5): " + calc.sum(5) + ln
                        + "Метод minus(5): " + minus(5) + ln
                        + "Метод multiply(444): " + multiply(444) + ln
                        + "Метод sumAllOperation(50): " + calc.sumAllOperation(50)
        );
    }
}
