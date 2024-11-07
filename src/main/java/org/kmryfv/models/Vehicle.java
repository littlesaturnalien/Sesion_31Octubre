package org.kmryfv.models;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void printInformation(){
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nYear: " + year);
    }
}
