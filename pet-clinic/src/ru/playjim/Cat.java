package ru.playjim;

public class Cat extends Animal{
    int weight;
    public Cat(String food, String location, int weight) {
        super(food, location);
        this.weight = weight;
    }

    @Override
    public void makeNoise(){
        System.out.println("meow, meow, meow!");
    }

    @Override
    public void eat(){
        System.out.println("ням, ням");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
