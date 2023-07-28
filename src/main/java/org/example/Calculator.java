package org.example;

public class Calculator {

    public int addition(int value1, int value2) {
        return value1 + value2;
    }

    public int subtraction(int value1, int value2) {
        return value1 - value2;
    }

    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public int divide(int value1, int value2) {
        if (value2 == 0) {
            throw new ArithmeticException();
        } else {
            return value1 / value2;
        }
    }
}
