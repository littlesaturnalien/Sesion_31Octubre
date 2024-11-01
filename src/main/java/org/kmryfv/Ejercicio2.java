package org.kmryfv;

import org.kmryfv.models.Product;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el nombre del producto: ");
            String name = sc.nextLine();
            System.out.println("Escribe el precio del producto: ");
            double price = sc.nextDouble();
            System.out.println("Escribe la cantidad inicial del producto: ");
            int quantity = sc.nextInt();
            Product product = new Product(name, price, quantity);

            String menu = "\nSISTEMA DE INVENTARIO BÁSICO" + "\n1. Aumentar Stock." +
                    "\n2. Reducir Stock." + "\n3. Calcular valor total de Stock." + "\n4. Salir"
                    + "\n--->";
            int opt = 0;

            while (opt != 4) {
                System.out.println(menu);
                opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("\nInserta la cantidad de stock a añadir del producto: ");
                        int addstock = sc.nextInt();
                        product.addStock(addstock);
                        System.out.println("Stock actualizado de " + product.getName()
                                + ": " + product.getQuantityAvailable());
                        break;

                    case 2:
                        System.out.println("\nInserta la cantidad de stock a restar del producto: ");
                        int subtractstock = sc.nextInt();
                        product.subtractStock(subtractstock);
                        System.out.println("Stock actualizado de " + product.getName()
                                + ": " + product.getQuantityAvailable());
                        break;

                    case 3:
                        System.out.println("\nValor total de existencias de " + product.getName()
                                + ": $" + product.totalValue());
                        break;

                    case 4:
                        System.out.println("\nSaliendo del programa...");
                        break;

                    default:
                        System.out.println("\nInserta una opción válida.\n");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
