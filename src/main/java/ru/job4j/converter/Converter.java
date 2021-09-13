package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euros.");

        float inEuro = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(inEuro);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 Euro. Test result : " + passed);

        System.out.println();

        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");

        float inDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedD = expectedDollar == outDollar;
        System.out.println("180 rubles are 3 Dollars. Test result : " + passedD);
    }
}