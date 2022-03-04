package ru.playjim;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(scanner.next().equals("+")) {
            System.out.println(sum(a,b));
        }
        else System.out.println("Ошибка: операция не известна");
    }
    public static int sum (int a, int b){
        return a + b;
    }
}
