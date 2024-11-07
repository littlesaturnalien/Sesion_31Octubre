package org.kmryfv.models;

public class Motorcycle extends Vehicle {
    private String color;

    private double price;

    public Motorcycle(String brand, String model, int year, String color, double price) {
        super(brand, model, year);
        this.color = color;
        this.price = price;
    }

    @Override
    public void printInformation(){
        super.printInformation();
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}
