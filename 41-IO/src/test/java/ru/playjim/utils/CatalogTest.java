package ru.playjim.utils;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

class CatalogTest {
    public static List<String> listDirectory = List.of("1/", "2/");
    public static List listFiles = List.of("test1", "test2", "test3");

    @Test
    void newDirectory() throws IOException {
        Catalog catalog = new Catalog();
        catalog.newDirectories(listDirectory);
    }

    @Test
    void newFile() throws IOException {
        Catalog catalog = new Catalog();
        catalog.newFiles(listFiles, listDirectory.get(0));
        catalog.newFiles(listFiles, listDirectory.get(1));
    }

    @Test
    void listDirectory() {
        Catalog catalog = new Catalog();
        for (String path : listDirectory
        ) {
            catalog.listDirectories(path);
        }
    }

    @Test
    void testListFiles() throws IOException {
        File catalog1 = new File("catalog1");
        catalog1.mkdir();
        new File("catalog1/1").createNewFile();
        for (File item: catalog1.listFiles()
             ) {
            System.out.println(item);
        }
    }
}