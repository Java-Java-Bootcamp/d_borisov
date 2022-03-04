package ru.playjim;

public class Animal {
    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void sleep() {
        System.out.println("zzz");
    }

    public void makeNoise() {
        System.out.println("makeNoise");
    }

    public void eat() {
        System.out.println("I eat");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
