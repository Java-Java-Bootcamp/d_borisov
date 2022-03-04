package ru.playjim;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("meat", "street", "german shepherd");
        Cat cat = new Cat("fish", "home", 3);
        Vet vet = new Vet();
        vet.treatAnimal(rex);
        vet.treatAnimal(cat);
        System.out.println(rex + " порода " + rex.getBreed());
        System.out.println(cat + " вес " + cat.getWeight());
    }
}
