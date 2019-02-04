package com.example.four_functioncalculator;

public class Calculate {
    private double total;

    public Calculate() {
        total = 0;
    }

    /**
     * Get the total
     * @return - total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Add a number to the total
     * @param n - number to add to the total
     */
    public void add(double n) {
        total = total + n;
    }

    /**
     * Subtract a number to the total
     * @param n - number to subtract to the total
     */
    public void subtract(double n) {
        total = total - n;
    }

    /**
     * Divide the total by a number
     * @param n - number to divide by
     */
    public void divide(double n) {
        total = total / n;
    }

    /**
     * Multiply the total by a number
     * @param n - number to multiply by
     */
    public void multiply(double n) {
        total = total * n;
    }

    /**
     * Resets the total to zero
     */
    public void reset() {
        total = 0;
    }


}
