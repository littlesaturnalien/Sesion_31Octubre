package org.kmryfv;

import org.kmryfv.models.Calculator;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);
            int opt = 0;
            while (opt != 4) {
                System.out.println("CALCULADORA");
                System.out.println("1. Suma de dos enteros.");
                System.out.println("2. Suma de dos double.");
                System.out.println("3. Suma de tres enteros.");
                System.out.println("4. Salir.");
                System.out.println("Opcion: ");
                opt = scanner.nextInt();
                scanner.nextLine();
                switch (opt) {
                    case 1:
                        System.out.println("Ingrese el primer número: ");
                        int n1 = scanner.nextInt();
                        System.out.println("Ingrese el segundo número: ");
                        int n2 = scanner.nextInt();
                        calculator.add(n1, n2);
                        break;
                    case 2:
                        System.out.println("Ingrese el primer número: ");
                        double d1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo número: ");
                        double d2 = scanner.nextDouble();
                        calculator.add(d1, d2);
                        break;
                    case 3:
                        System.out.println("Ingrese el primer número: ");
                        int a = scanner.nextInt();
                        System.out.println("Ingrese el segundo número: ");
                        int b = scanner.nextInt();
                        System.out.println("Ingrese el tercer número: ");
                        int c = scanner.nextInt();
                        calculator.add(a, b, c);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
