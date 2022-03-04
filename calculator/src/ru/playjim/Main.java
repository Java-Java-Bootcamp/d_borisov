package ru.playjim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operations = new String[]{"+", "-", "*", "/"};
        System.out.println("Введите первое слагаемое: ");
        int a = inputNumber();
        System.out.println("Введите второе слагаемое: ");
        int b = inputNumber();
        System.out.println("Выберите номер операции: ");
        for (int i = 0; i < operations.length; i++) {
            System.out.println((i + 1) + ". " + operations[i]);
        }
        switch (scanner.next()) {
            case "1":
                plus(a, b);
                break;
            case "2":
                minus(a, b);
                break;
            case "3":
                multiply(a, b);
                break;
            case "4":
                division(a, b);
                break;
            default:
                System.out.println("Ошибка: операция не известна");
                break;
        }
    }

    public static void plus(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public static void minus(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public static void division(int a, int b) {
        System.out.println(a + "/" + b + "=" + ((float) a / (float) b));
    }

    static void multiply(int a, int b) {
        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public static int inputNumber() {
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
