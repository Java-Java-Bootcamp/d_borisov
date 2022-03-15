package ru.playjim;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("unchecked")
public class MyList<E> implements List<E> {
    private Object[] data = new Object[5];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("[");
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                //str.deleteCharAt(str.length()-1);
                break;
            } else if (data[i+1] != null) {
                str.append(data[i]).append(",");
            } else str.append(data[i]);
        }
        str.append("]");
        return String.valueOf(str);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E e) {
        size++;
        if (size == data.length) {
            Object[] tempData = new Object[(int) (data.length * 1.5)];
            for (int i = 0; i < data.length; i++) {
                tempData[i] = data[i];
            }
            data = tempData;
        }
        data[size - 1] = e;
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public E get(int index) {
        checkListBounds(index);
        return (E) data[index];
    }

    private void checkListBounds(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public E set(int index, E element) {
        checkListBounds(index);
        E oldValue = (E) data[index];
        data[index] = element;
        return oldValue;
    }


    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }


    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
