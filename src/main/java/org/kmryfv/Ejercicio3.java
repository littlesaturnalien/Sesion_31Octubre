package org.kmryfv;

import org.kmryfv.models.Adress;
import org.kmryfv.models.Company;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Inventa un nombre para tu empresa: ");
            String nameCompany = sc.nextLine();
            Company company = new Company(nameCompany);
            System.out.println("Escribe la ciudad en que se ubica: ");
            String city = sc.nextLine();
            System.out.println("Escribe la calle: ");
            String street = sc.nextLine();
            System.out.println("Escribe su código postal: ");
            String postalCode = sc.nextLine();
            company.setAdress(new Adress(street, city, postalCode));

            System.out.println("INFORMACION DE LA EMPRESA\n" +"\nNombre: "+ company.getName()+
                    "\nDirección: " + company.getAdress());
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
