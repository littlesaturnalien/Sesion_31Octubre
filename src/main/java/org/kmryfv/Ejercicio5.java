package org.kmryfv;

import org.kmryfv.models.Book;
import org.kmryfv.models.Library;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            Library lib = new Library();
            Scanner sc = new Scanner(System.in);
            int opt = 0;
            while (opt != 4) {
                System.out.println("SISTEMA DE BIBLIOTECA");
                System.out.println("1. Añadir libro.");
                System.out.println("2. Eliminar libro.");
                System.out.println("3. Mostrar todos libros.");
                System.out.println("4. Salir.");
                System.out.print("Opción: ");
                opt = sc.nextInt();
                sc.nextLine();
                switch (opt) {
                    case 1:
                        System.out.println("Título del libro:");
                        String newTitle = sc.nextLine();
                        System.out.println("Autor del libro: ");
                        String newAuthor = sc.nextLine();
                        Book newBook = new Book(newTitle, newAuthor);
                        lib.addBook(newBook);
                        break;
                    case 2:
                        System.out.println("Título del libro a buscar:");
                        String title = sc.nextLine();
                        Book lookedBook = lib.getBookByTitle(title);
                        if (lookedBook != null) {
                            lib.removeBook(lookedBook);
                        } else {
                            System.out.println("No existe ese libro en la biblioteca.");
                        }
                        break;
                    case 3:
                        lib.showBooks();
                        break;
                    case 4:
                        System.out.println("\nSaliendo del programa...");
                        break;
                    default:
                        System.out.println("\nOpción no válida\n");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
