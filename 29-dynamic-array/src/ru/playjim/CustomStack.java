package ru.playjim;

public class CustomStack implements StackInterface {
    Object[] list = new Object[5];

    @Override
    public void push(Object value) {
        for (int i = 0; i < list.length; i++
        ) {
            if (list[i] == null) {
                list[i] = value;
                break;
            }
        }
    }
}
