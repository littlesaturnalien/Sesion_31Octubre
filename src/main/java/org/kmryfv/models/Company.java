package org.kmryfv.models;

public class Company {
    private String name;
    private Adress adress;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress.toString();
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
