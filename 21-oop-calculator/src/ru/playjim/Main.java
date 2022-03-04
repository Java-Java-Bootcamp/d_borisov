package ru.playjim;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operations = new String[]{"+", "-", "*", "/"};
        System.out.println("Введите первое слагаемое: ");
        System.out.println("Введите второе слагаемое: ");
        System.out.println("Выберите номер операции: ");
        for (int i = 0; i < operations.length; i++) {
            System.out.println((i + 1) + ". " + operations[i]);
        }
        switch (scanner.next()) {
            case "1":
//                plus(a, b);
                break;
            case "2":
//                minus(a, b);
                break;
            case "3":
                //multiply(a, b);
                break;
            case "4":
                //division(a, b);
                break;
            default:
                System.out.println("Ошибка: операция не известна");
                break;
        }
    }
// TODO: составить UML схему
// TODO: реализовать калькулятор в стиле ООП
}
