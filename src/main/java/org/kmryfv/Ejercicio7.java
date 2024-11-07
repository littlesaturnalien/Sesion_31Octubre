package org.kmryfv;

import org.kmryfv.dao.Cat;
import org.kmryfv.dao.Dog;

public class Ejercicio7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Acciones del perro");
        dog.Walk();
        dog.bark();
        dog.Eat();
        System.out.println("\nAcciones del gato");
        cat.Walk();
        cat.meow();
        cat.Eat();
    }
}
