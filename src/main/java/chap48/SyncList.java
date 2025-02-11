package chap48;

import java.util.Arrays;

import static chap41.util.ThreadUtils.sleep;

public class SyncList implements SimpleList{
    private static final int CAPACITY = 5;

    private Object[] elements;
    private int size = 0;

    public SyncList() {
        elements = new Object[CAPACITY];
    }

    @Override
    public synchronized int size() {
        return size;
    }

    @Override
    public synchronized void add(Object e) {
        elements[size++] = e;
        sleep(100);
        size++;
    }

    @Override
    public synchronized Object get(int index) {
        return elements[index];
    }

    @Override
    public synchronized String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size)) + " size =" + size + " capacity=" + elements.length;
    }
}
