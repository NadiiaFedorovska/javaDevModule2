package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        //Given
        Calculator calc = new Calculator();
        int value1 = 5;
        int value2 = 3;

        //When
        int result = calc.addition(value1, value2);

        //Then
        int expected = 8;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        //Given
        Calculator calc = new Calculator();
        int value1 = 5;
        int value2 = 10;

        //When
        int result = calc.subtraction(value1, value2);

        //Then
        int expected = -5;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        //Given
        Calculator calc = new Calculator();
        int value1 = 2;
        int value2 = 6;

        //When
        int result = calc.multiply(value1, value2);

        //Then
        int expected = 12;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivision() {
        //Given
        Calculator calc = new Calculator();
        int value1 = 10;
        int value2 = 2;

        //When
        int result = calc.divide(value1, value2);

        //Then
        int expected = 5;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivisionByZero() {
        // Given
        Calculator calc = new Calculator();
        int value1 = 10;
        int value2 = 0;

        // When & Then
        Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(value1, value2));
    }
}
