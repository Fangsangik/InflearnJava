package chap40.iter;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {
    //배열을 반복 할 수 있는 반복자

    private int curIndex = -1;
    //인덱스는 0부터 시작하기 때문에 -1을 갖는다.
    //다음 항목 조회시 0이 된다.
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return curIndex < targetArr.length - 1; //마지막까지 순회
    }

    @Override
    public Integer next() {
        return targetArr[++curIndex];
    }
}
