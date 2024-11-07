package org.kmryfv.models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Libro agregado: " + book.getTitle() + "\n");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Libro removido: " + book.getTitle() + "\n");
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("No se encontró este libro.\n");
        return null;
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("La biblioteca no tiene libros disponibles.\n");
        } else {
            System.out.println("LIBROS EN LA BIBLIOTECA\n");
            int cont = 1;
            for (Book book : books) {
                System.out.println(cont + ". " + book);
                cont++;
            }
        }
    }
}
