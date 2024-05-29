package org.math;

/*
 * This is an "all-static" class, i.e., one with nothing but static methods.
 * These methods are called from clients as Calculator.add(), Calculator.subtract(), etc.
 */
class Calculator {

    /*
     * Returns the average of the supplied integers.
     */
    public static double average(int first, int... rest) {   // first: 3  rest: 5, 10, 13
        double result = 0.0;

        int sum = first;
        for (int value : rest) {
            sum += value;  // sum = sum + value
        }

        result = (1.0 * sum) / (rest.length + 1);

        return result;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    /*
     * Indicates if the supplied integer is even or not.
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between 'min' and 'max' (inclusive).
     * TIP: think it thru using actual numbers, e.g., min=5 and max=20.
     */
    public static int randomInt(int min, int max) {
        int result = 0;

        double rand = Math.random();                        //  0.0000  to   0.9999
        double scaled = (rand * (max - min + 1)) + min;     //  5.0000  to  20.9999
        result = (int) scaled;

        return result;
    }

    /*
     * Convenience method to return a random integer between 1 and 'max' (inclusive).
     */
    public static int randomInt(int max) {
        return randomInt(1, max);  // delegate to "min-max" version, passing 1 for 'min'
    }

    /*
     * Convenience method to return a random integer between 1 and 16 (inclusive).
     */
    public static int randomInt() {
        return randomInt(1, 16);   // delegate to "min-max" version, passing 1 and 16 for min,max
    }
}