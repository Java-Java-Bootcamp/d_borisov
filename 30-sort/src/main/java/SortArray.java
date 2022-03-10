import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 4, 6, 2, 1};
        SortArray sort = new SortArray();
        sort.sortInsertion(numbers);
    }

    int[] sortBubble(int[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

    int[] sortInsertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j>0 && array[j-1]>temp){
                array[j] = array[j-1];
                j=j-1;
            }
            array[j]=temp;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
