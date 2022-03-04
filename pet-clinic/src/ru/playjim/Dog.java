package ru.playjim;

public class Dog extends Animal {
    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    private String breed;

    @Override
    public void makeNoise() {
        System.out.println("woof! woof!");
    }

    public String toString() {
        return "Dog";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
