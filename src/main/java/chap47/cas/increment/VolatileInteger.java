package chap47.cas.increment;

public class VolatileInteger implements IncrementInteger{

    private volatile int value; //인터페이스 필드이기 떄문에, 여러 스레드 공유 가능

    @Override
    public void increment() {
        value++;
    }

    @Override
    public int get() {
        return value;
    }
}
