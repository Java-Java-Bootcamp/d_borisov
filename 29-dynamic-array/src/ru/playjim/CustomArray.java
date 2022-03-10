package ru.playjim;

public class CustomArray implements Operations {
    private int[] items = new int[5];
    private int size = 0;

    CustomArray() {
    }

    //[1,2,xx,3,4,5]
    //[1,2,3,4,5,0]
    @Override
    public void insert(int value, int index) {
        if (index >= size && index < 0 ) throw new ArrayIndexOutOfBoundsException();
        if (size == items.length) {
            int[] newArray = new int[items.length * 2];
            for (int i = 0; i < index; i++) {
                newArray[i] = items[i];
            }
            for (int i = index; i < size; i++) {
                newArray[i + 1] = items[i];
            }
            items = newArray;
        } else {
            for (int i = size - 1; i >= index; i--) {
                items[i + 1] = items[i];
            }
        }
        items[index] = value;
        size++;
    }

    @Override
    public int get(int index) {
        if (index >= size && index < 0 ) throw new ArrayIndexOutOfBoundsException();
        return items[index];
    }

    @Override
    public void delete(int index) {
        if (index >= size && index < 0 ) throw new ArrayIndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            this.items[i] = items[i + 1];
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    public void print() {
        System.out.println("items.length = "+ items.length);
        System.out.println("size = "+ size());
        System.out.print("[");
        for(int i = 0; i < size; i++){
            System.out.print(items[i]);
            if(i < size -1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }


}
