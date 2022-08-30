package Chapter_5_Loops;

/**
 * 1. Написать программу высчитывающую факториал введённого целого числа.
 *
 *   Пример 1 * 2 * 3 * 4 * 5 = 5!
 *
 */

public class Task1 {


    public static void main(String[] args) {
        int value = 5;

        int result = factorialFor(value);
        System.out.println(result);

        int result2 = factorialWhile(value);
        System.out.println(result2);
    }

    public static int factorialFor(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i; // result = result * i;
        }

        return result;
    }

    public static int factorialWhile(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }

        return result;
    }


}