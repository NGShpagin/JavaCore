package ru.geekbrains.lesson1.regular;

/**
 * Декоратор. Он декорирует, т.е. накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */
public class Decorator {

    public static String decorate(int a) {
        return String.format("Here is your number: %d.", a);
    }
}
