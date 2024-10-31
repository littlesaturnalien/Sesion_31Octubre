package org.kmryfv;

import org.kmryfv.models.Person;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            Scanner sc = new Scanner(System.in);
            System.out.println("INGRESA TUS DATOS PERSONALES");
            System.out.println("Nombre: ");
            String name = sc.nextLine();
            person.setName(name);
            System.out.println("Edad: ");
            int age = sc.nextInt();
            person.setAge(age);
            System.out.println("Género: ");
            String gender = sc.next();
            person.setGender(gender);
            System.out.println("\nIMPRIMIENDO DATOS...\n");
            System.out.println(person.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}