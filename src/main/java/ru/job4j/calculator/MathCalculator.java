package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDevide(double first, double second) {
        return minus(first, second) + devide(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(first, second) + devide(first, second);
    }



    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы от вычитания и деления равен: " + sumMinusAndDevide(40, 20));
        System.out.println("Результат суммы вычисления всех четырех операций равен: " + sumAll(20, 20));
    }
}
