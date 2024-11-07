package org.kmryfv.dao;

import org.kmryfv.interfaces.Actions;

public class Dog implements Actions {
    @Override
    public void Walk() {
        System.out.println("El perro está caminando alegremente.");
    }

    @Override
    public void Eat() {
        System.out.println("El perro está comiendo un hueso.");
    }

    public void bark() {
        System.out.println("El perro ladra: ¡Guau, guau!");
    }
}
