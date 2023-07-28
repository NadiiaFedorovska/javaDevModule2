package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("calculator.addition(1,2) = " + calculator.addition(1, 2));
        System.out.println("calculator.subtraction(3,6) = " + calculator.subtraction(3, 6));
        System.out.println("calculator.multiply(6,8) = " + calculator.multiply(6, 8));
        System.out.println("calculator.divide(27,3) = " + calculator.divide(27, 3));
    }
}