package ru.playjim;

public class CustomStack<E> implements StackInterface {
    private E[] list = (E[]) new Object[10];
    private int size = 0;


    @Override
    public void push(Object value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = value;
                size++;
                break;
            }
        }
    }

    @Override
    public Object top() {
        return list[size - 1];
    }

    @Override
    public Object pop() {
        list[size] = null;
        size--;
        return list[size];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
