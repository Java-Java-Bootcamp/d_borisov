package ru.playjim;

import ru.playjim.util.StudentUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsService {

    public static Map<String, List<Student>> groupBySpecialty(List<Student> students) {
        Map<String, List<Student>> map = new HashMap<>();
        for (Student student: students) {
            List<Student> subList = map.getOrDefault(student.getSpecialty(), new ArrayList<>());
            subList.add(student);
            map.put(student.getSpecialty(), subList);
        }

        return map;
    }

    public static Map<String, List<Student>> groupBySpecialtyWithStream(List<Student> students) {
        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getSpecialty));
        return map;
    }
    public static double gpaStudents(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::getGpaScore)
                .average()
                .getAsDouble();
    }
    public static List<Student> studentListBall(List<Student> students) {
        return students.stream()
                .filter(i -> i.getGpaScore() > 51)
                .toList();
    }

    public static void main(String[] args) {
        List<Student> students = StudentUtil.generate();
        Map<String, List<Student>> map = groupBySpecialty(students);
//        for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//        }

        System.out.println("**************************************************************");

        map = groupBySpecialtyWithStream(students);
        for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        Double averageGpa = gpaStudents(students);
        System.out.println("avgGPA=" + averageGpa);
        System.out.println(studentListBall(students));
    }

}
