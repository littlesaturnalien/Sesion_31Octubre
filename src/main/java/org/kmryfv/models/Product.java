package org.kmryfv.models;

public class Product {
    private String name;
    private double price;
    private int quantityAvailable;

    public Product(String name, double price, int quantityAvailable) {
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public void addStock(int quantity){
        this.quantityAvailable += quantity;
    }

    public void subtractStock(int quantity){
        this.quantityAvailable -= quantity;
        if (this.quantityAvailable < 0){
            this.quantityAvailable = 0;
            System.out.println("No hay más existencias en el inventario.");
        }
    }

    public double totalValue(){
        return this.quantityAvailable * this.price;
    }
}
