package ru.playjim;

public interface StackInterface<E> {
    void push(Object i);

    Object top();

    Object pop();

    boolean isEmpty();
}
