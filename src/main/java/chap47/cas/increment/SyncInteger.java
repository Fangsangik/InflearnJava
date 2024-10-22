package chap47.cas.increment;

public class SyncInteger implements IncrementInteger{

    private int value; //인터페이스 필드이기 떄문에, 여러 스레드 공유 가능

    @Override
    public synchronized void increment() {
        value++;
    }

    @Override
    public synchronized int get() {
        return value;
    }
}
