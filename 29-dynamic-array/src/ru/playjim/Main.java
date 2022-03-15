package ru.playjim;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var list = new ArrayList<>();
        /*
        CustomArray intArray = new CustomArray();
        intArray.insert(1, 0);
        intArray.insert(2, 1);
        intArray.insert(3, 2);
        intArray.insert(4, 3);
        intArray.print();
        intArray.insert(55,1);
        //intArray.delete(2);
        intArray.print();

         */
        CustomStack stack = new CustomStack();
        Scanner sc = new Scanner(System.in);
        stack.push("test");
        stack.push(new Integer(1));
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
    }
}
