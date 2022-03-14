package ru.playjim;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void getYoungWorkers() {
        var w1 = new Worker("Dmitry","",Sex.MALE,25,"Soft Engineer","Moscow");
        var w2 = new Worker("Elena","",Sex.FEMALE,37,"Project Manager","Omsk");
        var w3 = new Worker("Maxim","",Sex.MALE,20,"Junior","Tokio");
        var w4 = new Worker("Sergey","",Sex.MALE,23,"","Las Vegas");

        var app = new Application();
        var result = app.getYoungWorkers(List.of(w1,w2));
        assertEquals(List.of(w1),result);
    }
    @Test
    void getFirstYoungWorkers() {
        var w1 = new Worker("Dmitry","",Sex.MALE,25,"Soft Engineer","Moscow");
        var w2 = new Worker("Elena","",Sex.FEMALE,20,"Project Manager","Omsk");
        var w3 = new Worker("Maxim","",Sex.MALE,28,"Junior","Tokio");
        var w4 = new Worker("Sergey","",Sex.MALE,29,"","Las Vegas");

        var app = new Application();
        var result = app.getFirstYoungWorker(List.of(w1,w2,w3,w4));
        assertEquals(w3,result);
    }
}