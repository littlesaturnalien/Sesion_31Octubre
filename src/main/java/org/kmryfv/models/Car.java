package org.kmryfv.models;

public class Car extends Vehicle {
    private String color;

    private double price;

    public Car(String brand, String model, int year, String color, double price) {
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
