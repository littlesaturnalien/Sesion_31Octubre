package org.kmryfv.dao;

import org.kmryfv.interfaces.Actions;

public class Cat implements Actions {
    @Override
    public void Walk() {
        System.out.println("El gato camina con elegancia.");
    }

    @Override
    public void Eat() {
        System.out.println("El gato está comiendo atún.");
    }

    public void meow() {
        System.out.println("El gato maúlla: ¡Miau, miau!");
    }
}
