package ru.playjim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc implements Operations {
    private int x;
    private int y;
    private String operation;

    public Calc(int x, int y, String operation) {
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    public void plus(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void minus(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public void division(int a, int b) {
        System.out.println(a + "/" + b + "=" + ((float) a / (float) b));
    }

    public void multiply(int a, int b) {
        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public int inputNumber() {
        int x;
        do {
            try {
                x = new Scanner(System.in).nextInt();
                return x;
            } catch (InputMismatchException e) {
                System.out.println("Введите число!");
            }
        } while (true);
    }
}
