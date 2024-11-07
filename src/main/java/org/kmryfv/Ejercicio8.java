package org.kmryfv;

import org.kmryfv.dao.Circle;
import org.kmryfv.dao.Rectangle;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int opt = 0;
            while (opt != 3) {
                System.out.println("CALCULAR ÁREA");
                System.out.println("1. Círculo.");
                System.out.println("2. Rectángulo.");
                System.out.println("3. Salir.");
                System.out.print("Opción: ");
                opt = sc.nextInt();
                sc.nextLine();
                switch (opt) {
                    case 1:
                        System.out.println("\nIngresa el radio del círculo: ");
                        double radius = sc.nextDouble();
                        Circle circle = new Circle(radius);
                        System.out.println("El área es: " + circle.calculateArea());
                        break;
                    case 2:
                        System.out.println("\nIngresa la base del rectángulo: ");
                        double base = sc.nextDouble();
                        System.out.println("Ingresa la altura del rectángulo: ");
                        double height = sc.nextDouble();
                        Rectangle rectangle = new Rectangle(base, height);
                        System.out.println("El área es: " + rectangle.calculateArea());
                        break;
                    case 3:
                        System.out.println("\nSaliendo del programa...");
                        break;
                    default:
                        System.out.println("\nOpción no válida.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
