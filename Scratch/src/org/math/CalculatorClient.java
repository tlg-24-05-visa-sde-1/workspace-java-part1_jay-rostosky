package org.math;

class CalculatorClient {

    public static void main(String[] args) {
        double sum = Calculator.add(1.5, 4.5);  // pass doubles where doubles are expected
        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + Calculator.subtract(1, 4));  // ints get "upcast" to doubles

        boolean result = Calculator.isEven(9);
        System.out.println("result is: " + result);

        System.out.println();

        int winner = Calculator.randomInt(5, 20);  // calls the "min-max" version
        System.out.println("The winner is: " + winner);

        double avg = Calculator.average(3, 5, 10, 13);  // should be 7.75
        System.out.println("The average is: " + avg);
    }
}