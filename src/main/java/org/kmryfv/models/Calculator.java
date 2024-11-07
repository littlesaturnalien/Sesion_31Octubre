package org.kmryfv.models;

public class Calculator {
    public int add(int a, int b) {
        System.out.println("Suma de dos enteros: " + a + " + " + b + " = " + (a + b));
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("Suma de dos double: " + a + " + " + b + " = " + (a + b));
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("Suma de tres enteros: " + a + " + " + b + " + " + c + " = " + (a + b + c));
        return a + b + c;
    }
}