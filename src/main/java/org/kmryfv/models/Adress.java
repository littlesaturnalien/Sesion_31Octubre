package org.kmryfv.models;

public class Adress {
    private String street;
    private String city;
    private String postalCode;

    public Adress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return  street + ", " + city + ", " +
                "CP: " + postalCode;
    }
}
