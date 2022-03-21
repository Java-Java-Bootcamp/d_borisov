package ru.playjim.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Catalog {
    public void listDirectories(String nameDirectory) {
        System.out.println(nameDirectory);
        for (File fileTemp : Objects.requireNonNull(new File(nameDirectory).listFiles())) {
            System.out.println(fileTemp);
        }
    }

    public void newFiles(List<String> nameFiles, String directoryPath) throws IOException {
        for (String name : nameFiles) {
            new File(directoryPath + name).createNewFile();
        }
    }

    public void newDirectories(List<String> nameDirectory) throws IOException {
        for (String name : nameDirectory) {
            new File(name).mkdir();
        }
    }
}
