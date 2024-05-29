package chap33.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    //얼마나 만들 수 있는지
    public MyArrayListV1(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    //초기 배열의 크기
    public MyArrayListV1(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    //배열의 순서대로 값을 집어 넣는다.
    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    public Object get(int index){
        return elementData[index];
    }

    //배열의 특정 위치에 값을 setting
    public Object set(int index, Object element){
        Object oldVal = get(index); //기본 값을 반환
        elementData[index] = element; //새로 들어온 항목을 배열에 집어 넣어 주고
        return oldVal;
    }

    //배열에 몇번째 있는지 찾는다.
    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size="
                + size + " capacity=" + elementData.length;
    }
    //Arrays.copyOf -> 배열에서 size 만큼 copy
}
