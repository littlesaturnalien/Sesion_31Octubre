package org.kmryfv.dao;

import org.kmryfv.interfaces.GeometricFigure;

public class Rectangle implements GeometricFigure {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.base*this.height;
    }
}
