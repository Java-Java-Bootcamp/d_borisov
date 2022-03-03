package ru.otus.array;

import ru.otus.array.util.ArrayUtil;

public class Arrays {

    public int[] reverseArray(int[] array) {
        ArrayUtil.printArray(array);
        int[] reverse = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i != -1; i--) {
            reverse[j] = array[i];
            j++;
        }
        return reverse;
    }

    public float average(int[] array) {
        ArrayUtil.printArray(array);
        float sum = 0f;
        for (int i: array
             ) {
            sum+=i;
        }
        return sum/array.length;
    }
}