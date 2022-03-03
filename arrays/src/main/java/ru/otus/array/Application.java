package ru.otus.array;
import ru.otus.array.util.ArrayUtil;

public class Application {
    public static void main(String[] args) {
        int[] array = ArrayUtil.generateArray(10);

        Arrays task = new Arrays();
        ArrayUtil.printArray(task.reverseArray(array));
        System.out.println(task.average(array));
/*
        String left = "";
        String right = "";
        Anagram anagram = new Anagram();
        boolean result = anagram.check(left, right);

        System.out.println(result);

 */
    }
}
