package chap48;

import java.util.Arrays;

import static chap41.util.ThreadUtils.sleep;

public class BasicList implements SimpleList {

    private static final int CAPACITY = 5;

    private Object[] elements;
    private int size = 0;

    public BasicList() {
        this.elements = new Object[CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }


    //원자적 연산 아니다.
    @Override
    public void add(Object e) {
        elements[size] = e;
        sleep(100); //멀티 스레드를 만드는 쉽게 확인하는 코드
        size++;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size)) + " size =" + size + " capacity=" + elements.length;
    }
}
