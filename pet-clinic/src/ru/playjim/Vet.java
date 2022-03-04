package ru.playjim;

public class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println(animal + " " + "питается " + animal.getFood());
        System.out.println(animal + " обитает в " + animal.getLocation());
    }
}
