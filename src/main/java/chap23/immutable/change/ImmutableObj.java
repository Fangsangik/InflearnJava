package chap23.immutable.change;

import chap23.immutable.address.ImmutableAddress;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int rst = value + addValue;
        //ImmutableObj immutableObj = new ImmutableObj(30);
        return new ImmutableObj(rst);
    }

    public int getValue() {
        return value;
    }
}
