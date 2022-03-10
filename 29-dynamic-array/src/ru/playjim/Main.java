package ru.playjim;

public class Main {

    public static void main(String[] args) {
        CustomArray intArray = new CustomArray();
        intArray.insert(1, 0);
        intArray.insert(2, 1);
        intArray.insert(3, 2);
        intArray.insert(4, 3);
        intArray.print();
        intArray.insert(55,1);
        //intArray.delete(2);
        intArray.print();
    }
}
