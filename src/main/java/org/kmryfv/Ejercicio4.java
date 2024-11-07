package org.kmryfv;

import org.kmryfv.models.Car;
import org.kmryfv.models.Motorcycle;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int opc = 0;
            String menu = "\nAÑADIR: 1. Carro, 2. Moto, 3. Salir";
            while (opc != 3) {
                System.out.println(menu);
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Marca: ");
                        String brand = sc.next();
                        System.out.println("Modelo: ");
                        String model = sc.next();
                        System.out.println("Año: ");
                        int year = sc.nextInt();
                        System.out.println("Color: ");
                        String color = sc.next();
                        System.out.println("Precio: ");
                        double price = sc.nextDouble();
                        Car car = new Car(brand, model, year, color, price);
                        car.printInformation();
                        break;

                    case 2:
                        System.out.println("Marca: ");
                        String brand2 = sc.next();
                        System.out.println("Modelo: ");
                        String model2 = sc.next();
                        System.out.println("Año: ");
                        int year2 = sc.nextInt();
                        System.out.println("Color: ");
                        String color2 = sc.next();
                        System.out.println("Precio: ");
                        double price2 = sc.nextDouble();
                        Motorcycle motorcycle = new Motorcycle(brand2, model2, year2, color2, price2);
                        motorcycle.printInformation();
                        break;

                    case 3:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
