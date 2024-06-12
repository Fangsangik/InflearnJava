package chap36.collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size = 0;

    //O(n)
    public boolean add(int val) {
        if (contain(val)) {
            return false;
        }

        elementData[size] = val;
        size++;
        return true;
    }

    //O(n)
    public boolean contain(int val) {
        for (int data : elementData) {
            if (data == val){
                return true;
            }
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
