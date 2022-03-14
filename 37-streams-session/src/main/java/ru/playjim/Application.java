package ru.playjim;

import java.util.List;
import java.util.Optional;

public class Application {
    List<Worker> getYoungWorkers(List<Worker> workers) {
        return workers.stream()
                .filter(i -> i.getAge() < 30)
                .toList();
    }
    Optional<Worker> getFirstYoungWorker(List<Worker> workers) {
        return workers.stream()
                .filter(item -> item.getAge() > 25)
                .findFirst();
    }
    /*
    Map<Sex,Integer> getMaleAndFemaleCount(List<Worker> workers) {

    }
     */
    public static void main(String[] args) {
        System.out.println(new Worker("Elena","",Sex.FEMALE,37,"Project Manager","Omsk"));
    }
}
