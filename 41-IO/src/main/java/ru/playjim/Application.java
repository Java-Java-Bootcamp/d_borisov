package ru.playjim;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Application {
    public static void main(String[] args) {
        try (BufferedOutputStream op = new BufferedOutputStream(new FileOutputStream("Cat.txt"))) {
            op.write("кот".getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
        try (BufferedOutputStream op = new BufferedOutputStream(new FileOutputStream("Dog.txt"))) {
            op.write("собака".getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
